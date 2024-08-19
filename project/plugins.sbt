addDependencyTreePlugin

lazy val laikaV = "1.2.0"

lazy val root = (project in file(".")).
  enablePlugins(BuildInfoPlugin).
  settings(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion, "laika" -> laikaV),
    buildInfoPackage := "testShareVar"
  )

addSbtPlugin("org.typelevel" % "laika-sbt" % laikaV)
