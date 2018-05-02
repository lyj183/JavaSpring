package Annotations;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 17:16
 * @Description:
 **/

// 5.6 Spring 中的事件处理
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("ContextStoppedEvent Received");
    }
}
