organization := "com.sandinh"

name := "akka-guice"

version := "3.4.0_5.1"

scalaVersion := "2.13.1"

crossScalaVersions := Seq("2.12.10", "2.13.1")

scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-feature", "-target:jvm-1.8")
scalacOptions ++= (CrossVersion.scalaApiVersion(scalaVersion.value) match {
  case Some((2, 11)) => Seq("-Ybackend:GenBCode")
  case _ => Nil
})

libraryDependencies ++= Seq(
  "com.google.inject.extensions" % "guice-assistedinject" % "5.1.0",
  "com.typesafe.akka"   %% "akka-actor"   % "2.6.1",
  "com.typesafe.akka"   %% "akka-testkit" % "2.6.1" % Test
)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % Test

