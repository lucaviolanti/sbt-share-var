Global / onChangedBuildSource := ReloadOnSourceChanges

inThisBuild(
  Seq(
    scalaVersion := Versions.scala3,
  )
)

enablePlugins(LaikaPlugin)

lazy val sbtShareVar = project
  .in(file("."))
  .settings(
    libraryDependencies += "org.typelevel" %% "laika-core" % testShareVar.BuildInfo.laika
  )