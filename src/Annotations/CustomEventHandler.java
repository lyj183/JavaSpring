package Annotations;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 17:23
 * @Description:
 **/

// 5.7 Spring 中的自定义事件
import org.springframework.context.ApplicationListener;
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}
