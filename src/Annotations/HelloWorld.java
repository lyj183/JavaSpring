package Annotations;
import javax.annotation.*;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 15:36
 * @Description:
 **/

// 5.4、Spring JSR-250 注释
// 5.4.1、@PostConstruct 和 @PreDestroy 注释
/*
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public String getMessage(){
        System.out.println("Your Message : " + message);
        return message;
    }
    @PostConstruct
    public void init(){
        System.out.println("Bean is going through init.");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
*/

// 5.5 Spring 基于 Java 的配置
// 5.5.1 @Configuration 和 @Bean 注解
// 5.6 Spring 中的事件处理
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
