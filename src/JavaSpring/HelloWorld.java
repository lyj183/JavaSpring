package JavaSpring;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 17:24
 * @Description:
 **/

// 1、Spring HelloWorld 实例
// 2、Spring IoC 容器
// 2.1、Spring BeanFactory 容器
// 2.2、Spring ApplicationContext 容器
// 2.3、Bean 的作用域 (Singleton & Prototype)
/*
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }
}
*/

// 2.4、Spring Bean 生命周期
// 2.5、Spring Bean 后置处理器
/*
public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
*/

// 2.6、Spring Bean 定义继承
public class HelloWorld {
    private String message1;
    private String message2;
    public void setMessage1(String message){
        this.message1  = message;
    }
    public void setMessage2(String message){
        this.message2  = message;
    }
    public void getMessage1(){
        System.out.println("World Message1 : " + message1);
    }
    public void getMessage2(){
        System.out.println("World Message2 : " + message2);
    }
}
