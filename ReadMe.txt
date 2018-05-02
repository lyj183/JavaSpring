https://www.w3cschool.cn/wkspring
https://www.tutorialspoint.com/spring/index.htm (原文)

一、安装Java Spring 框架
A、新建工程选择Spring工程，自动下载包 Spring-4.3.13.RELEASE
B、Modules -> <Module source> 下 + AspectJ

二、实例
1、Spring HelloWorld 实例 (JavaSpring 包)
创建 HelloWorld.Java
创建 MainApp.Java
创建 Beans.xml

2、Spring IoC 容器 (JavaSpring 包)
2.1、Spring BeanFactory 容器
改写 MainApp.Java

2.2、Spring ApplicationContext 容器
改写 MainApp.Java

2.3、Bean 的作用域 (Singleton & Prototype)
改写 MainApp.Java
改写 Beans.xml

2.4、Spring Bean 生命周期
改写 HelloWorld.Java
改写 MainApp.Java
改写 Beans.xml

2.5、Spring Bean 后置处理器
改写 HelloWorld.Java(同2.4)
改写 MainApp.Java(同2.4)
改写 Beans.xml
创建 InitHelloWorld.java

2.6、Spring Bean 定义继承
改写 HelloWorld.Java
创建 HelloChina.java
改写 MainApp.Java
改写 Beans.xml

3、Spring 依赖注入 (JavaSpring 包)
3.1、Spring 基于构造函数的依赖注入
创建 SpellChecker.java
创建 TextEditor.java
改写 MainApp.Java
改写 Beans.xml

3.2、Spring 基于设值函数的依赖注入
改写 TextEditor.java
改写 Beans.xml

3.3、Spring 注入内部 Beans
改写 Beans.xml

3.4、Spring 注入集合
创建 JavaCollection.java
改写 MainApp.Java
改写 Beans.xml

4、Spring Beans 自动装配 autowire (JavaSpring 包)
4.1、Spring 自动装配 'byName'
改写 SpellChecker.java(同3)
改写 TextEditor.java
改写 MainApp.Java
改写 Beans.xml

4.2、Spring 自动装配 'byType'
改写 Beans.xml

4.3、Spring 由构造函数自动装配
改写 TextEditor.java
改写 Beans.xml

5、Spring 基于注解的配置 (Annotations 包)
说明：需要在Beans.xml中使用 <context:annotation- config/>
     隐式地向 Spring容器注册AutowiredAnnotationBeanPostProcessor、
                          RequiredAnnotationBeanPostProcessor、
                          CommonAnnotationBeanPostProcessor、
                          PersistenceAnnotationBeanPostProcessor
     这4个BeanPostProcessor。
5.1、Spring @Required 注释
创建 Student.java
创建 MainApp.Java
改写 Beans.xml，注释掉<property name="age"  value="11"/>看报错

5.2、Spring @Autowired 注释
创建 SpellChecker.java
创建 TextEditor.java
改写 Beans.xml

5.2.1、属性中的 @Autowired
改写 TextEditor.java

5.2.2、构造函数中的 @Autowired
改写 TextEditor.java

5.2.3、@Autowired 的（required=false）选项
改写 Student.java
改写 Beans.xml(同5.1)

5.3、Spring @Qualifier 注释
改写 Student.java(同5.1)
创建 Profile.java
改写 MainApp.Java
改写 Beans.xml

5.4、Spring JSR-250 注释
5.4.1、@PostConstruct 和 @PreDestroy 注释
创建 HelloWorld.Java
改写 MainApp.Java
改写 Beans.xml

5.4.2、@Resource 注释
改写 TextEditor.java

5.5、Spring 基于 Java 的配置
5.5.1、@Configuration 和 @Bean 注解
创建 HelloWorldConfig.java
改写 HelloWorld.Java
不需要 Beans.xml

5.5.2、注入 Bean 的依赖性
创建 TextEditorConfig.java
改写 TextEditor.java
不需要 Beans.xml

5.5.3、@Import 注解（无例子）
5.5.4、生命周期回调（无例子）

5.6、Spring 中的事件处理
改写 HelloWorld.Java(同5.5.1)
创建 CStartEventHandler.java
创建 CStopEventHandler.java
改写 MainApp.Java
改写 Beans.xml

5.7、Spring 中的自定义事件
创建 CustomEvent.java
创建 CustomEventPublisher.java
创建 CustomEventHandler.java
改写 MainApp.Java
改写 Beans.xml

6、Spring 框架的 AOP (Annotations 包)
6.1、Spring 中基于 AOP 的 XML架构
在项目中添加 Spring AOP 指定的库文件 aspectjrt.jar， aspectjweaver.jar 和 aspectj.jar
创建 Logging.java
改写 Student.java
改写 MainApp.Java
改写 Beans.xml

6.2、Spring 中基于 AOP 的 @AspectJ
改写 Logging.java
改写 Beans.xml

7、Spring JDBC 框架 (SpringJDBC 包)
7.1、Spring JDBC 示例
在项目中添加 Spring JDBC 指定的最新的库 mysql-connector-java.jar
创建 MySql的JavaSpring数据库，Student表（Gemini-local，root，123456）
创建 StudentDAO.java
创建 Student.java
创建 StudentMapper.java
创建 StudentJDBCTemplate.java
创建 MainApp.java
改写 Beans.xml (注意添加useSSL=true，即<property name="url" value="jdbc:mysql://localhost:3306/JavaSpring?useSSL=true"/>)

7.2、Spring 中 SQL 的存储过程 (按照例子未成功)
改写 StudentDAO.java
改写 StudentJDBCTemplate.java

8、Spring 事务管理 (SpringJDBC 包)
8.1、Spring 编程式事务管理
创建 MySql的JavaSpring数据库，Student表（Gemini-local，root，123456）（同7、）
创建 MySql的JavaSpring数据库，Marks表（Gemini-local，root，123456）
改写 StudentDAO.java
创建 StudentMarks.java
创建 StudentMarksMapper.java
改写 StudentJDBCTemplate.java (其中 int sid = jdbcTemplateObject.queryForInt( SQL2 ); 改为 int sid = jdbcTemplateObject.queryForObject( SQL2, Integer.class);
改写 MainApp.java
改写 Beans.xml (注意点，同7、)

8.2、Spring 声明式事务管理 (按照例子提示不一致)
改写 StudentJDBCTemplate.java
改写 Beans.xml (注意点，同7、)

9、Spring Web MVC 框架 (看04_JavaSpringMVC)

