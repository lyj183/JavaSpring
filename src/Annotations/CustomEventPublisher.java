package Annotations;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/13 17:23
 * @Description:
 **/

// 5.7 Spring 中的自定义事件
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
public class CustomEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher){
        this.publisher = publisher;
    }
    public void publish() {
        CustomEvent ce = new CustomEvent(this);
        publisher.publishEvent(ce);
    }
}