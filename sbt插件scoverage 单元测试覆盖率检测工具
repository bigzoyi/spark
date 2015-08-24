sbt插件scoverage 单元测试覆盖率检测工具
使用方法：
在project/plugins.sbt中添加如下内容：
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.1")

resolvers += Resolver.url("scoverage-bintray", url("https://dl.bintray.com/sksamuel/sbt-plugins/"))(Resolver.ivyStylePatterns)

然后运行sbt clean coverage test即可在target/scala-2.10/scoverage-report/index.html目录下面生成html格式的单元测试报告，使用浏览器打开接口观察单元测试覆盖率。
