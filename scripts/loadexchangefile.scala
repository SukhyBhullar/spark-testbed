import au.com.bytecode.opencsv.CSVParser
import org.apache.spark.rdd.RDD

val exchangeFile = "/vagrant/files/Abide_TF_gross_trades_for_settlement_EOD.txt.20150514"
val exchangedf = sqlContext.load("com.databricks.spark.csv", Map("path" -> exchangeFile, "header" -> "true", "delimiter" -> " "))

exchangedf.registerTempTable("exchanges")
