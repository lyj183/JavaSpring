package Annotations;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 17:22
 * @Description:
 **/

// 5.7 Spring 中的自定义事件
import org.springframework.context.ApplicationEvent;
public class CustomEvent extends ApplicationEvent{
    public CustomEvent(Object source) {
        super(source);
    }
    public String toString(){
        return "My Custom Event";
    }
}
