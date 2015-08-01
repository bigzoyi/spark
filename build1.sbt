 

val sparkVersion="1.4.0"
val sparkDependencies=Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion,
      "org.apache.spark" %% "spark-graphx" % sparkVersion,
        "org.apache.spark" %% "spark-mllib" % sparkVersion,
          "org.apache.spark" %% "spark-sql" % sparkVersion,
            "org.apache.spark" %% "spark-hive" % sparkVersion,
              "org.apache.spark" %% "spark-catalyst" % sparkVersion,
                "org.scalatest" % "scalatest_2.10" % "2.1.3" % "test"
  )
 

lazy val commonSettings= Seq(
    organization := "com.huawei.bigdata",
      version := "1.0",
        scalaVersion := "2.10.4"
  )
 

lazy val root=(project in file(".")).aggregate(sparkSbt).settings(aggregate in update :=false)
 
lazy val sparkSbt = (project in file("sparkSbt")).settings(commonSettings: _*).settings(
     name :="sparkSbt",
        libraryDependencies ++=sparkDependencies
  )
