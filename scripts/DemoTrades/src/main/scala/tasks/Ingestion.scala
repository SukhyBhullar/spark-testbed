package abide.examples.tasks

import org.apache.spark.rdd.RDD
import abide.examples.model.AbideRow
import org.apache.spark.SparkContext

object Ingestion {

  def DropHeader(data: RDD[String]): RDD[String] = {
               data.mapPartitionsWithIndex((idx, lines) => {
                 if (idx == 0) {
                   lines.drop(1)
                 }
                 lines
               })
             }


  def IngestRows(sc : SparkContext, path: String) : RDD[AbideRow] = {

    val trades = sc.textFile(path)
    DropHeader(trades).map(_.split(",")).map(p => new AbideRow(p(0),p(1),p(2),p(3),p(4),p(5),p(6),p(7),p(8),p(9),p(10),p(11),p(12),p(13),p(14),p(15),p(16),p(17),p(18),p(19), p(20)))

  }



}
