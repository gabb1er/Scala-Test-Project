import Dependencies._

ThisBuild / scalaVersion     := "2.12.16"
ThisBuild / versionScheme    := Some("semver-spec")
ThisBuild / version          := Version.releaseVersion

lazy val root = (project in file("."))
  .settings(
    name := "scala-test-project",
    libraryDependencies ++= Seq(scalaTest)
  )


