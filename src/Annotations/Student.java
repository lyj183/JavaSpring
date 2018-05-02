package Annotations;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 14:06
 * @Description:
 **/

// 5.1、Spring @Required 注释
// 5.3、Spring @Qualifier 注释
/*
import org.springframework.beans.factory.annotation.Required;
public class Student {
    private Integer age;
    private String name;
    @Required
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
*/

// 5.2.3、@Autowired 的（required=false）选项
// 默认情况下，@Autowired 注释意味着依赖是必须的，它类似于 @Required 注释，然而，你可以使用 @Autowired 的（required=false）选项关闭默认行为。
// 即使你不为 age 属性传递任何参数，下面的示例也会成功运行，但是对于 name 属性则需要一个参数。
/*
import org.springframework.beans.factory.annotation.Autowired;
public class Student {
    private Integer age;
    private String name;
    @Autowired(required=false)
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    @Autowired
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
*/

// 6、Spring 框架的 AOP (Annotations 包)
// 6.1 Spring 中基于 AOP 的 XML架构
// 6.2 Spring 中基于 AOP 的 @AspectJ
public class Student {
    private Integer age;
    private String name;
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        System.out.println("Age : " + age );
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }
    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}