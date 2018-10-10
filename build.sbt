name := """formation"""
organization := "com.clever-institut"

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
	.enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.6"

libraryDependencies += guice
libraryDependencies += javaJdbc
libraryDependencies += ws
libraryDependencies += "com.h2database" % "h2" % "1.4.197"