name := "DemoTrades"

version := "1.0"

scalaVersion := "2.10.4"

fork := true

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.4.0"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.4.0"

libraryDependencies += "org.apache.spark"  %% "spark-hive-thriftserver" % "1.4.0"
