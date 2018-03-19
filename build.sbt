
name := "schema-registry-with-scala"

version := "0.1"
scalaVersion := "2.12.4"

description := """Trucking IoT on HDF"""
organization := "com.orendainx.trucking"
homepage := Some(url("https://github.com/orendain/schema-registry-with-scala"))
organizationHomepage := Some(url("https://github.com/orendain/schema-registry-with-scala"))
licenses := Seq(("Apache License 2.0", url("https://www.apache.org/licenses/LICENSE-2.0")))

libraryDependencies ++= Seq(
  ("com.hortonworks.registries" % "schema-registry-serdes" % "0.3.0.3.0.1.1-5"),
//    .exclude("commons-beanutils", "commons-beanutils") // vs itself - commons-beanutils/commons-beanutils-core
//    .exclude("commons-collections", "commons-collections") // vs itself - commons-beanutils/commons-beanutils-core
//    .exclude("org.springframework", "spring-aop"), // vs itself - aopalliance/intercept/ConstructorInvocation.class

  "javax.xml.bind" % "jaxb-api" % "2.3.0",

  "com.typesafe" % "config" % "1.3.1",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2"
)