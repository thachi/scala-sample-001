name := "scala-ample-001"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "com.typesafe" %% "scalalogging-slf4j" % "1.0.1"
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "ch.qos.logback" % "logback-classic" % "1.0.13"
)

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

