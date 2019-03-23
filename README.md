1.github上新建项目
2。新建model maven 项目
3。添加配置文件 pom文件中添加

application.proties 配置文件 配置项目测试的 接口路径和域名

数据库配置文件 databaseConfig.xml

model和mapper中的sql.xml 文件一一对应

执行sql语句的工具类 DatabaseUtil 这个对象是用来执行sql语句 后期写一个单例 模式维护起来

ConfigFile 工具类是用来拼接url的工具类和InterfaceName 枚举对象结合使用 获取 application 中的接口路径
