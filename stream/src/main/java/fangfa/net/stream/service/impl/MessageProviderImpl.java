package fangfa.net.stream.service.impl;

import fangfa.net.model.Product;
import fangfa.net.stream.myprovider.DefaultProcess;
import fangfa.net.stream.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

@EnableBinding(DefaultProcess.class)
public class MessageProviderImpl implements IMessageProvider {


    /**
     * 指定Qualifier 的名称,不然会找到多个
     */
    @Resource
    @Qualifier(DefaultProcess.OUTPUT)
    private MessageChannel output;

    /**
     * 实现消息的发送
     *
     * @param product 消息体
     */
    @Override
    public void send(Product product) {
        this.output.send(MessageBuilder.withPayload(product).build());
    }
}