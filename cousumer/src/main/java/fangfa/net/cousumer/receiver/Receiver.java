package fangfa.net.cousumer.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: green
 * @version: 1.0
 * @Date: 2019/4/10/010
 * @description:
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void receiver(String hello) {
        System.out.println("Receiver : " + hello);
    }

}