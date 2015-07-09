package abide.examples.model

import org.apache.spark.rdd.RDD
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

class AbideRow(cReportType: String,
                cSequencenumber: String,
                cCounterpartyIDType: String,
                cCounterpartyID: String,
                cIDoftheothercounterpartyType: String,
                cIDoftheothercounterparty: String,
                cNameofthecounterparty: String,
                cDomicileofthecounterparty: String,
                cCountryofcounterparty: String,
                cCorporatesectorofthecounterparty: String,
                cFinancialornonfinancialnatureoftheCounterparty: String,
                cBrokerIDType: String,
                cBrokerID: String,
                cReportingentityIDType: String,
                cReportingentityID: String,
                cClearingmemberIDType: String,
                cClearingmemberID: String,
                cBeneficiaryIDType: String,
                cBeneficiaryID: String,
                cTradingcapacity: String,
                cCounterpartySide: String,
                cContractwithnonEEAcounterparty: String,
                cDirectlylinkedtocommercialactivityortreasuryfinancing: String,
                cClearingthreshold: String,
                cMarktomarketvalueofcontract: String,
                cCurrencyofmarktomarketvalueofthecontract: String,
                cValuationdate: String,
                cValuationtime: String,
                cValuationtype: String,
                cCollateralisation: String,
                cCollateralportfolio: String,
                cCollateralportfoliocode: String,
                cValueofthecollateral: String,
                cCurrencyofthecollateralvalue: String,
                cTaxonomyused: String,
                cProductID1: String,
                cProductID2: String,
                cUnderlyingIDType: String,
                cUnderlying: String,
                cCountryofunderlying: String,
                cNotionalcurrency1: String,
                cNotionalcurrency2: String,
                cDeliverablecurrency: String,
                cDeliverablecurrency2: String,
                cTradeIDPositionID: String,
                cTransactionreferencenumber: String,
                cRecordID: String,
                cVenueofexecution: String,
                cCompression: String,
                cPriceOrRate: String,
                cPricenotation: String,
                cNotionalamount: String,
                cPricemultiplier: String,
                cQuantity: String,
                cUpFrontpayment: String,
                cDeliverytype: String,
                cExecutionDate: String,
                cExecutiontime: String,
                cEffectivedate: String,
                cMaturitydate: String,
                cTerminationdate: String,
                cDateofSettlement: String,
                cMasterAgreementtype: String,
                cMasterAgreementVersion: String,
                cConfirmationDate: String,
                cConfirmationtime: String,
                cConfirmationmeans: String,
                cClearingobligation: String,
                cCleared: String,
                cClearingDate: String,
                cClearingtime: String,
                cCCPIDType: String,
                cCCP: String,
                cIntragroup: String,
                cFixedrateofleg1: String,
                cFixedrateofleg2: String,
                cFixedratedaycount: String,
                cFixedratedaycount2: String,
                cFixedlegpaymentfrequency: String,
                cFixedLegPaymentFrequency2: String,
                cFloatingratepaymentfrequency: String,
                cFloatingratepaymentfrequency2: String,
                cFloatingrateresetfrequency: String,
                cFloatingRateResetFrequency2: String,
                cFloatingRateDayCount: String,
                cFloatingRateDayCount2: String,
                cFloatingrateofleg1: String,
                cFloatingrateofleg2: String,
                cCurrency2: String,
                cExchangerate1: String,
                cForwardexchangerate: String,
                cExchangeratebasis: String,
                cCommoditybase: String,
                cCommodityDetails: String,
                cDeliverypointorzone: String,
                cInterconnectionPoint: String,
                cLoadtype: String,
                cDeliverystartdateandtime: String,
                cDeliveryenddateandtime: String,
                cContractcapacity: String,
                cQuantityUnit: String,
                cPricepertimeintervalquantities: String,
                cOptiontype: String,
                cOptionstyle: String,
                cStrikeprice: String,
                cActiontype: String,
                cDetailsofactiontype : String) extends Product with Serializable{
  val ReportType: String = cReportType
  val Sequencenumber: String = cSequencenumber
  val CounterpartyIDType: String = cCounterpartyIDType
  val CounterpartyID: String = cCounterpartyID
  val IDoftheothercounterpartyType: String = cIDoftheothercounterpartyType
  val IDoftheothercounterparty: String = cIDoftheothercounterparty
  val Nameofthecounterparty: String = cNameofthecounterparty
  val Domicileofthecounterparty: String = cDomicileofthecounterparty
  val Countryofcounterparty: String = cCountryofcounterparty
  val Corporatesectorofthecounterparty: String = cCorporatesectorofthecounterparty
  val FinancialornonfinancialnatureoftheCounterparty: String = cFinancialornonfinancialnatureoftheCounterparty
  val BrokerIDType: String = cBrokerIDType
  val BrokerID: String = cBrokerID
  val ReportingentityIDType: String = cReportingentityIDType
  val ReportingentityID: String = cReportingentityID
  val ClearingmemberIDType: String = cClearingmemberIDType
  val ClearingmemberID: String = cClearingmemberID
  val BeneficiaryIDType: String = cBeneficiaryIDType
  val BeneficiaryID: String = cBeneficiaryID
  val Tradingcapacity: String = cTradingcapacity
  val CounterpartySide: String = cCounterpartySide
  val ContractwithnonEEAcounterparty: String = cContractwithnonEEAcounterparty
  val Directlylinkedtocommercialactivityortreasuryfinancing: String = cDirectlylinkedtocommercialactivityortreasuryfinancing
  val Clearingthreshold: String = cClearingthreshold
  val Marktomarketvalueofcontract: String = cMarktomarketvalueofcontract
  val Currencyofmarktomarketvalueofthecontract: String = cCurrencyofmarktomarketvalueofthecontract
  val Valuationdate: String = cValuationdate
  val Valuationtime: String = cValuationtime
  val Valuationtype: String = cValuationtype
  val Collateralisation: String = cCollateralisation
  val Collateralportfolio: String = cCollateralportfolio
  val Collateralportfoliocode: String = cCollateralportfoliocode
  val Valueofthecollateral: String = cValueofthecollateral
  val Currencyofthecollateralvalue: String = cCurrencyofthecollateralvalue
  val Taxonomyused: String = cTaxonomyused
  val ProductID1: String = cProductID1
  val ProductID2: String = cProductID2
  val UnderlyingIDType: String = cUnderlyingIDType
  val Underlying: String = cUnderlying
  val Countryofunderlying: String = cCountryofunderlying
  val Notionalcurrency1: String = cNotionalcurrency1
  val Notionalcurrency2: String = cNotionalcurrency2
  val Deliverablecurrency: String = cDeliverablecurrency
  val Deliverablecurrency2: String = cDeliverablecurrency2
  val TradeIDPositionID: String = cTradeIDPositionID
  val Transactionreferencenumber: String = cTransactionreferencenumber
  val RecordID: String = cRecordID
  val Venueofexecution: String = cVenueofexecution
  val Compression: String = cCompression
  val PriceOrRate: String = cPriceOrRate
  val Pricenotation: String = cPricenotation
  val Notionalamount: String = cNotionalamount
  val Pricemultiplier: String = cPricemultiplier
  val Quantity: String = cQuantity
  val UpFrontpayment: String = cUpFrontpayment
  val Deliverytype: String = cDeliverytype
  val ExecutionDate: String = cExecutionDate
  val Executiontime: String = cExecutiontime
  val Effectivedate: String = cEffectivedate
  val Maturitydate: String = cMaturitydate
  val Terminationdate: String = cTerminationdate
  val DateofSettlement: String = cDateofSettlement
  val MasterAgreementtype: String = cMasterAgreementtype
  val MasterAgreementVersion: String = cMasterAgreementVersion
  val ConfirmationDate: String = cConfirmationDate
  val Confirmationtime: String = cConfirmationtime
  val Confirmationmeans: String = cConfirmationmeans
  val Clearingobligation: String = cClearingobligation
  val Cleared: String = cCleared
  val ClearingDate: String = cClearingDate
  val Clearingtime: String = cClearingtime
  val CCPIDType: String = cCCPIDType
  val CCP: String = cCCP
  val Intragroup: String = cIntragroup
  val Fixedrateofleg1: String = cFixedrateofleg1
  val Fixedrateofleg2: String = cFixedrateofleg2
  val Fixedratedaycount: String = cFixedratedaycount
  val Fixedratedaycount2: String = cFixedratedaycount2
  val Fixedlegpaymentfrequency: String = cFixedlegpaymentfrequency
  val FixedLegPaymentFrequency2: String = cFixedLegPaymentFrequency2
  val Floatingratepaymentfrequency: String = cFloatingratepaymentfrequency
  val Floatingratepaymentfrequency2: String = cFloatingratepaymentfrequency2
  val Floatingrateresetfrequency: String = cFloatingrateresetfrequency
  val FloatingRateResetFrequency2: String = cFloatingRateResetFrequency2
  val FloatingRateDayCount: String = cFloatingRateDayCount
  val FloatingRateDayCount2: String = cFloatingRateDayCount2
  val Floatingrateofleg1: String = cFloatingrateofleg1
  val Floatingrateofleg2: String = cFloatingrateofleg2
  val Currency2: String = cCurrency2
  val Exchangerate1: String = cExchangerate1
  val Forwardexchangerate: String = cForwardexchangerate
  val Exchangeratebasis: String = cExchangeratebasis
  val Commoditybase: String = cCommoditybase
  val CommodityDetails: String = cCommodityDetails
  val Deliverypointorzone: String = cDeliverypointorzone
  val InterconnectionPoint: String = cInterconnectionPoint
  val Loadtype: String = cLoadtype
  val Deliverystartdateandtime: String = cDeliverystartdateandtime
  val Deliveryenddateandtime: String = cDeliveryenddateandtime
  val Contractcapacity: String = cContractcapacity
  val QuantityUnit: String = cQuantityUnit
  val Pricepertimeintervalquantities: String = cPricepertimeintervalquantities
  val Optiontype: String = cOptiontype
  val Optionstyle: String = cOptionstyle
  val Strikeprice: String = cStrikeprice
  val Actiontype: String = cActiontype
  val Detailsofactiontype : String = cDetailsofactiontype

  override def productElement(n: Int): Any =
    n match {
    case 0 => ReportType
    case 1 => Sequencenumber
    case 2 => CounterpartyIDType
    case 3 => CounterpartyID
    case 4 => IDoftheothercounterpartyType
    case 5 => IDoftheothercounterparty
    case 6 => Nameofthecounterparty
    case 7 => Domicileofthecounterparty
    case 8 => Countryofcounterparty
    case 9 => Corporatesectorofthecounterparty
    case 10 => FinancialornonfinancialnatureoftheCounterparty
    case 11 => BrokerIDType
    case 12 => BrokerID
    case 13 => ReportingentityIDType
    case 14 => ReportingentityID
    case 15 => ClearingmemberIDType
    case 16 => ClearingmemberID
    case 17 => BeneficiaryIDType
    case 18 => BeneficiaryID
    case 19 => Tradingcapacity
    case 20 => CounterpartySide
    case 21 => ContractwithnonEEAcounterparty
    case 22 => Directlylinkedtocommercialactivityortreasuryfinancing
    case 23 => Clearingthreshold
    case 24 => Marktomarketvalueofcontract
    case 25 => Currencyofmarktomarketvalueofthecontract
    case 26 => Valuationdate
    case 27 => Valuationtime
    case 28 => Valuationtype
    case 29 => Collateralisation
    case 30 => Collateralportfolio
    case 31 => Collateralportfoliocode
    case 32 => Valueofthecollateral
    case 33 => Currencyofthecollateralvalue
    case 34 => Taxonomyused
    case 35 => ProductID1
    case 36 => ProductID2
    case 37 => UnderlyingIDType
    case 38 => Underlying
    case 39 => Countryofunderlying
    case 40 => Notionalcurrency1
    case 41 => Notionalcurrency2
    case 42 => Deliverablecurrency
    case 43 => Deliverablecurrency2
    case 44 => TradeIDPositionID
    case 45 => Transactionreferencenumber
    case 46 => RecordID
    case 47 => Venueofexecution
    case 48 => Compression
    case 49 => PriceOrRate
    case 50 => Pricenotation
    case 51 => Notionalamount
    case 52 => Pricemultiplier
    case 53 => Quantity
    case 54 => UpFrontpayment
    case 55 => Deliverytype
    case 56 => ExecutionDate
    case 57 => Executiontime
    case 58 => Effectivedate
    case 59 => Maturitydate
    case 60 => Terminationdate
    case 61 => DateofSettlement
    case 62 => MasterAgreementtype
    case 63 => MasterAgreementVersion
    case 64 => ConfirmationDate
    case 65 => Confirmationtime
    case 66 => Confirmationmeans
    case 67 => Clearingobligation
    case 68 => Cleared
    case 69 => ClearingDate
    case 70 => Clearingtime
    case 71 => CCPIDType
    case 72 => CCP
    case 73 => Intragroup
    case 74 => Fixedrateofleg1
    case 75 => Fixedrateofleg2
    case 76 => Fixedratedaycount
    case 77 => Fixedratedaycount2
    case 78 => Fixedlegpaymentfrequency
    case 79 => FixedLegPaymentFrequency2
    case 80 => Floatingratepaymentfrequency
    case 81 => Floatingratepaymentfrequency2
    case 82 => Floatingrateresetfrequency
    case 83 => FloatingRateResetFrequency2
    case 84 => FloatingRateDayCount
    case 85 => FloatingRateDayCount2
    case 86 => Floatingrateofleg1
    case 87 => Floatingrateofleg2
    case 88 => Currency2
    case 89 => Exchangerate1
    case 90 => Forwardexchangerate
    case 91 => Exchangeratebasis
    case 92 => Commoditybase
    case 93 => CommodityDetails
    case 94 => Deliverypointorzone
    case 95 => InterconnectionPoint
    case 96 => Loadtype
    case 97 => Deliverystartdateandtime
    case 98 => Deliveryenddateandtime
    case 99 => Contractcapacity
    case 100 => QuantityUnit
    case 101 => Pricepertimeintervalquantities
    case 102 => Optiontype
    case 103 => Optionstyle
    case 104 => Strikeprice
    case 105 => Actiontype
    case 106 => Detailsofactiontype
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

      override def productArity: Int = 107

      override def canEqual(that: Any): Boolean = that.isInstanceOf[AbideRow]

}
