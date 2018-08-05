// Sample build.sbt.
// Note:
//   Blank lines need to separate the statements.
//   := means you are setting the value for that key
//   += means you are adding to the values for that key

name := "Jenkins test project"

version := "0.1"

organization := "InigoIllan"

scalaVersion := "2.11.9"

sbtVersion := "1.2.0"

enablePlugins(GitVersioning)
git.useGitDescribe := true
releaseIgnoreUntrackedFiles := true

// The dependencies are in Maven format, with % separating the parts.  
// Notice the extra bit "test" on the end of JUnit and ScalaTest, which will 
// mean it is only a test dependency.
//
// The %% means that it will automatically add the specific Scala version to the dependency name.  
// For instance, this will actually download scalatest_2.9.2

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

libraryDependencies += "junit" % "junit" % "4.12" % "test"

