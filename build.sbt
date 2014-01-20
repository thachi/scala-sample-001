name := "scala-ample-001"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "com.typesafe" %% "scalalogging-log4j" % "1.0.1",
  "org.apache.logging.log4j" % "log4j-core" % "2.0-beta9",
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test"
)

