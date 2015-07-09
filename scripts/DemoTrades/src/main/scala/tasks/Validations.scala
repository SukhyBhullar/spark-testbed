package abide.examples.tasks

import org.apache.spark.rdd.RDD
import abide.examples.model.AbideRow


object Validation {
  def IDMatchesIDType (IDType : String, ID : String): Boolean = IDType match {
    case "B" => ID.length >= 8 && ID.length <= 11
    case "L" => ID.length == 20
    case "I" => ID.length == 20
    case "C" => true
    case "" => true
    case _ => false
  }

  def CheckCounterPartyIDType (rows : RDD[AbideRow]) : RDD[AbideRow] = {
    rows.filter((row : AbideRow) => IDMatchesIDType(row.CounterpartyIDType, row.CounterpartyID))
  }

  def CheckBrokerIDType (rows : RDD[AbideRow]) : RDD[AbideRow] = {
    rows.filter((row : AbideRow) => IDMatchesIDType(row.BrokerIDType, row.BrokerID))
  }

}
