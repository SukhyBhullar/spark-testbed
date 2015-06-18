import au.com.bytecode.opencsv.CSVParser
import org.apache.spark.rdd.RDD

val practiceFile = "/usr/data/practice.csv"
val practiceData = sc.textFile(practiceFile).cache()

val prescriptionFile = "/usr/data/prescription.csv"
val prescriptionData = sc.textFile(prescriptionFile).cache()

// The schema is encoded in a string
val practiceSchema = "Date|BNFCode|Name|Address1|Address2|Address3|Address4|Postcode"

// Import Row.
import org.apache.spark.sql.Row;
// Import Spark SQL data types
import org.apache.spark.sql.types.{StructType,StructField,StringType};

// Generate the schema based on the string of schema
val schema =
  StructType(
    practiceSchema.split("|").map(fieldName => StructField(fieldName, StringType, true)))

val rowRDD = practiceData.mapPartitions(lines => {
    val parser = new CSVParser(',')
    lines.map(line => {
        val columns = parser.parseLine(line)
      })
    })

// Apply the schema to the RDD.
val practiceDataFrame = sqlContext.createDataFrame(rowRDD, schema)

// Register the DataFrames as a table.
practiceDataFrame.registerTempTable("practices")

// SQL statements can be run by using the sql methods provided by sqlContext.
val londoncount = sqlContext.sql("SELECT Count(*) FROM practices WHERE Address1 like '%LONDON%")

// The results of SQL queries are DataFrames and support all the normal RDD operations.
// The columns of a row in the result can be accessed by ordinal.
results.map(t => "Name: " + t(0)).collect().foreach(println)
