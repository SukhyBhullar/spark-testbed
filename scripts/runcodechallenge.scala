import au.com.bytecode.opencsv.CSVParser
import org.apache.spark.rdd.RDD

val practiceFile = "/usr/data/practice.csv"
val practiceData = sc.textFile(practiceFile).cache()

val prescriptionFile = "/usr/data/prescription.csv"
val prescriptionData = sc.textFile(prescriptionFile).cache()

def dropHeader(data: RDD[String]): RDD[String] = {
         data.mapPartitionsWithIndex((idx, lines) => {
           if (idx == 0) {
             lines.drop(1)
           }
           lines
         })
       }
       prescriptionData
val presWithoutHeader: RDD[String] = dropHeader(prescriptionData)

val r1 = practiceData.mapPartitions(lines => {
    val parser = new CSVParser(',')
    lines.map(line => {
        val columns = parser.parseLine(line)
        columns.slice(3,7)
      })
    }).filter(_.map(_.trim contains "LONDON") contains true).count

val r2totals = presWithoutHeader.mapPartitions(lines => {
    val parser = new CSVParser(',')
    lines.map(line => {
        val columns = parser.parseLine(line)
        (columns(3), (columns(5).toInt, columns(7).toFloat))
      })
    }).filter(_._1 == "0102000T0").
    reduceByKey((x,y) => (x._1 + y._1, x._2 + y._2)).
    take(1)(0)._2

val r2 = r2totals._2 / r2totals._1

println("Practices in London " + r1)
println("Average of Peppermint Oil " + r2)
