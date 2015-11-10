package abide.examples.model

import org.apache.spark.rdd.RDD
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

case class AbideRow(ReportType: String,
                Sequencenumber: String,
                CounterpartyIDType: String,
                CounterpartyID: String,
                IDoftheothercounterpartyType: String,
                IDoftheothercounterparty: String,
                Nameofthecounterparty: String,
                Domicileofthecounterparty: String,
                Countryofcounterparty: String,
                Corporatesectorofthecounterparty: String,
                FinancialornonfinancialnatureoftheCounterparty: String,
                BrokerIDType: String,
                BrokerID: String,
                ReportingentityIDType: String,
                ReportingentityID: String,
                ClearingmemberIDType: String,
                ClearingmemberID: String,
                BeneficiaryIDType: String,
                BeneficiaryID: String,
                Tradingcapacity: String,
                CounterpartySide: String
              )
