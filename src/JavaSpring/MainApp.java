package JavaSpring;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 17:31
 * @Description:
 **/

// 1、Spring HelloWorld 实例
/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
        helloWorld.getMessage();
    }
}
*/

// 2、Spring IoC 容器
// 2.1、Spring BeanFactory 容器
/*
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class MainApp {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld obj = (HelloWorld)factory.getBean("helloWorld");
        obj.getMessage();
    }
}
*/

// 2.2、Spring ApplicationContext 容器
/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("/src/Beans.xml");
        HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
        obj.getMessage();
    }
}
*/

// 2.3、Bean 的作用域 (Singleton & Prototype)
/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        objA.getMessage();
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();
    }
}
*/

// 2.4、Spring Bean 生命周期
// 2.5、Spring Bean 后置处理器
/*
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook(); // 注册一个在 AbstractApplicationContext 类中声明的关闭 hook 的 registerShutdownHook() 方法。它将确保正常关闭，并且调用相关的 destroy 方法。
    }
}
*/

// 2.6、Spring Bean 定义继承
/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.getMessage1();
        objA.getMessage2();
        HelloChina objB = (HelloChina) context.getBean("helloChina");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }
}
*/

// 3、Spring 依赖注入
// 3.1、Spring 基于构造函数的依赖注入
// 3.2、Spring 基于设值函数的依赖注入
// 3.3、Spring 注入内部 Beans
/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }
}
*/

// 3.4、Spring 注入集合
/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
*/

// 4、Spring Beans 自动装配
// 4.1、Spring 自动装配 'byName'
// 4.2、Spring 自动装配 'byType'
// 4.3、Spring 由构造函数自动装配

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
        System.out.println("Name: " + textEditor.getName());
    }
}
