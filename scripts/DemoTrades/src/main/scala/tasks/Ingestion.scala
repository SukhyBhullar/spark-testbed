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
    DropHeader(trades).map(_.split(",")).map(p => new AbideRow(p(0),p(1),p(2),p(3),p(4),p(5),p(6),p(7),p(8),p(9),p(10),p(11),p(12),p(13),p(14),p(15),p(16),p(17),p(18),
                                                            p(19),p(20),p(21),p(22),p(23),p(24),p(25),p(26),p(27),p(28),p(29),p(30),p(31),p(32),p(33),p(34),p(35),p(36),p(37),p(38),p(39),p(40),p(41),p(42),p(43),
                                                            p(44),p(45),p(46),p(47),p(48),p(49),p(50),p(51),p(52),p(53),p(54),p(55),p(56),p(57),p(58),p(59),p(60),p(61),p(62),p(63),p(64),p(65),p(66),p(67),p(68),
                                                            p(69),p(70),p(71),p(72),p(73),p(74),p(75),p(76),p(77),p(78),p(79),p(80),p(81),p(82),p(83),p(84),p(85),p(86),p(87),p(88),p(89),p(90),p(91),p(92),p(93),
                                                            p(94),p(95),p(96),p(97),p(98),p(99),p(100),p(101),p(102),p(103),p(104),p(105),""))

  }



}
