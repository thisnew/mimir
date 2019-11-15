package org.thisnew
import org.apache.spark.sql.{SaveMode, SparkSession}

object AppSca {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder()
      .appName("myjob")
      .enableHiveSupport()
      .getOrCreate()
    val df = spark.table("code_inter").createOrReplaceTempView("")

  }

}
