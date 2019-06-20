package fangfa.net.provider3;

import fangfa.net.model.Product;
import fangfa.net.stream.myprovider.DefaultProcess;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(DefaultProcess.class)
public class MessageListener {

    @StreamListener(DefaultProcess.INPUT)
    public void input(Message<Product> message) {
        System.out.println("【*** 消息接收 ***】" + message.getPayload());
    }
}