
version := "1.0.0-SNAPSHOT"
organization := "com.actimust"
scalaVersion := "2.12.3"

name := "play-spring-loader"
crossPaths := false


lazy val root = project in file(".")

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % "2.6.6",
  "org.springframework" % "spring-context" % "4.3.5.RELEASE"
)

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomIncludeRepository := { _ => false }

pomExtra :=
  <url>https://github.com/remithieblin/play-spring-loader</url>
    <licenses>
      <license>
        <name>BSD-style</name>
        <url>http://www.opensource.org/licenses/bsd-license.php</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:remithieblin/play-spring-loader.git</url>
      <connection>scm:git:git@github.com:remithieblin/play-spring-loader.git</connection>
    </scm>
    <developers>
      <developer>
        <id>remi.thieblin</id>
        <name>Remi Thieblibn</name>
      </developer>
    </developers>