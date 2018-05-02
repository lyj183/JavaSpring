package Annotations;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 14:08
 * @Description: 5、Spring 基于注解的配置
 **/

// 5.1、Spring @Required 注释
// 5.2.3、@Autowired 的（required=false）选项
/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );
    }
}
*/

// 5.2、Spring @Autowired 注释
// 5.2.1、属性中的 @Autowired
// 5.2.2、构造函数中的 @Autowired
// 5.4.2、@Resource 注释
/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
*/

// 5.3、Spring @Qualifier 注释
/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();
    }
}
*/

// 5.4、Spring JSR-250 注释
// 5.4.1、@PostConstruct 和 @PreDestroy 注释
/*
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
*/

// 5.5 Spring 基于 Java 的配置
// 5.5.1 @Configuration 和 @Bean 注解
/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();
    }
}
*/

// 5.5.2 注入 Bean 的依赖性
/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te = ctx.getBean(TextEditor.class);

        te.spellCheck();
    }
}
*/

// 5.6 Spring 中的事件处理
/*
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        context.start();
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.stop();
    }
}
*/

// 5.7 Spring 中的自定义事件
/*
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
        cvp.publish();
        cvp.publish();
    }
}
*/

// 6、Spring 框架的 AOP
// 6.1 Spring 中基于 AOP 的 XML架构
// 6.2 Spring 中基于 AOP 的 @AspectJ
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}