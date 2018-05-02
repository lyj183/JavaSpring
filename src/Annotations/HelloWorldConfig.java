package Annotations;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 16:06
 * @Description:
 **/

// 5.5 Spring 基于 Java 的配置
// 5.5.1 @Configuration 和 @Bean 注解
import org.springframework.context.annotation.*;
@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
