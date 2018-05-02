package Annotations;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 17:15
 * @Description:
 **/

// 5.6 Spring 中的事件处理
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent Received");
    }
}
