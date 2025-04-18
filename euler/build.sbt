val scala3Version = "3.3.5"

lazy val root = project
  .in(file("."))
  .settings(
    name := "euler",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
