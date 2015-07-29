/**
 * Created by sukhvinder.bhullar on 19/06/2015.
 */
package abide.examples

import org.apache.spark.rdd.RDD
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import abide.examples.model.AbideRow
import abide.examples.tasks._
import  org.apache.spark.sql.hive.thriftserver._

object DemoTrades {

  def main(args: Array[String]): Unit =
  {

    val conf = new SparkConf().setAppName("Demo EMIR Trade Repo")
    val sc = new SparkContext(conf)
    val sqlContext = new org.apache.spark.sql.hive.HiveContext(sc)
    import sqlContext.implicits._

    val filepath = "/vagrant/files/54930023MRU76783OL52_20140321_175823_RAIL-KRX_0001.csv"
    val ingestedrows = Ingestion.IngestRows(sc, filepath)

    val validrows = Validation.CheckCounterPartyIDType(Validation.CheckBrokerIDType(ingestedrows))

    val validRowsDataFrame = validrows.toDF()
    validRowsDataFrame.registerTempTable("ValidRows")

    val results = sqlContext.sql("SELECT Count(*) FROM ValidRows")

    results.map(t => "Count: " + t(0)).collect().foreach(println)

    validRowsDataFrame.saveAsTable("ValidRows")

    HiveThriftServer2.startWithContext(sqlContext)
  }
}
