name := "common"
version :="1.0"
scalaVersion :="2.12.12"
sbtPlugin :=true


lazy val common = project.in(file("common"))
.settings(
    
libraryDependencies += "io.github.embeddedkafka" %% "embedded-kafka" % "2.4.0" ,

libraryDependencies += "org.json4s" %% "json4s-native" % "3.7.0-M7",

libraryDependencies += "org.scalactic" %% "scalactic" % "3.3.0-SNAP3",

libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test,

libraryDependencies += "org.mockito" %% "mockito-scala" % "1.16.13" % Test,


)



lazy val actor = project.in(file("actor"))
.settings(

libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % "2.6.10",

libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.10",

libraryDependencies += "com.typesafe.akka" %% "akka-persistence-typed" % "2.6.10",

libraryDependencies += "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.10" % Test,

libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test,



 ).dependsOn(common)


 
lazy val Root = project.in(file(".")).aggregate(common,actor)



 
