name := "Coding Challenge"

version := "1.0"

scalaVersion := "2.10.4"

resolvers ++= Seq(
  "spark-thrift-server-1.5.1" at "https://repository.apache.org/content/repositories/orgapachespark-1086/",  "spark-1.5.1" at "https://repository.apache.org/content/repositories/orgapachespark-1083/"

)

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.5.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.5.1"
libraryDependencies += "com.databricks" % "spark-csv_2.11" % "1.0.3"
libraryDependencies += "org.apache.spark"  %% "spark-hive-thriftserver" % "1.5.1"
