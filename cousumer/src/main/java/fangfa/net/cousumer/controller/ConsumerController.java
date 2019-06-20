package fangfa.net.cousumer.controller;

import fangfa.net.cousumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: green
 * @version: 1.0
 * @Date: 2019/6/18/018
 * @description:
 */
@RestController
public class ConsumerController {

    private ConsumerService consumerService;

    @Autowired
    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @GetMapping("/get_consumer")
    public String getConsumer() throws Exception {
        return consumerService.getConsumer()+"-0";
    }


    @GetMapping("/hello")
    public String hello() {
        return "consumer";
    }

}
