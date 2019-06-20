package fangfa.net.stream;


import fangfa.net.model.Product;

public interface IMessageProvider {

    /**
     * 实现消息的发送
     **/
    void send(Product product);
}