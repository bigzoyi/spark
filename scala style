推荐大家使用scalastyle插件  用于对scala代码风格进行检查  使用比较简单  spark中使用也是这个插件  参考网址http://www.scalastyle.org/  使用方式如下：在project目录下面创建plugins.sbt文件，添加如下内容：
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.7.0")

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"
然后运行如下命令：
sbt scalastyleGenerateConfig
生成一个scalastyle-config.xml文件，该文件用于记录scala的编程规范。
最后运行
sbt scalastyle
会在shell端生成相应的提示信息，可根据提示信息进行修改。   大家可以看看写的代码有哪些是可以改进的 
