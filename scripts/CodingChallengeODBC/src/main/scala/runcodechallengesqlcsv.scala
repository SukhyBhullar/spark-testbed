package abide.examples

import org.apache.spark.rdd.RDD
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import  org.apache.spark.sql.hive.thriftserver._

object CodingChallengeODBC {

  def main(args: Array[String])
  {
    val conf = new SparkConf().setAppName("Coding Challenge")
    val sc = new SparkContext(conf)
    val sqlContext = new org.apache.spark.sql.hive.HiveContext(sc)

    val practiceFile = "/usr/data/practice.csv"
    val practiceData = sc.textFile(practiceFile).cache()

    val prescriptionFile = "/usr/data/prescription.csv"
    val prescriptionData = sc.textFile(prescriptionFile).cache()

    // The schema is encoded in a string
    val practiceSchema = "Date BNFCode Name Address1 Address2 Address3 Address4 Postcode"

    // Import Row.
    import org.apache.spark.sql.Row;
    // Import Spark SQL data types
    import org.apache.spark.sql.types.{StructType,StructField,StringType};

    // Generate the schema based on the string of schema
    val schema =
      StructType(
        practiceSchema.split(" ").map(fieldName => StructField(fieldName, StringType, true)))

    val rowRDD = practiceData.map(_.split(",")).map(p =>
        Row(
        p(0).trim
        ,p(1).trim
        ,p(2).trim
        ,p(3).trim
        ,p(4).trim
        ,p(5).trim
        ,p(6).trim
        ,p(7).trim
      ))

    // Apply the schema to the RDD.
    val practiceDataFrame = sqlContext.createDataFrame(rowRDD, schema)
    //val practiceDataFrame = sqlContext.read.format("com.databricks.spark.csv").option("header", "true").load("/usr/data/practice.csv")

    // Register the DataFrames as a table.
    practiceDataFrame.saveAsTable("practices")

    // SQL statements can be run by using the sql methods provided by sqlContext.
//    val results = sqlContext.sql("SELECT Name FROM practices")

    // The results of SQL queries are DataFrames and support all the normal RDD operations.
    // The columns of a row in the result can be accessed by ordinal.
//    results.map(t => "Name: " + t(0)).collect().foreach(println)

    HiveThriftServer2.startWithContext(sqlContext)
  }
}
