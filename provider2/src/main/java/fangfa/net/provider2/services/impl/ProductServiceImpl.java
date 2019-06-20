package fangfa.net.provider2.services.impl;

import fangfa.net.model.Product;
import fangfa.net.provider2.services.ProductService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: green
 * @version: 1.0
 * @Date: 2019/6/18/018
 * @description:
 */
@Service
public class ProductServiceImpl implements ProductService {

    private AmqpTemplate rabbitTemplate;

    @Autowired
    public ProductServiceImpl(AmqpTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    /**
     * 测试
     *
     * @param id id
     * @return 测试
     */
    @Override
    public Product getById(Long id) {
        Product product = new Product();
        product.setId(id);
        product.setAge(26);
        product.setName("green2");
        this.rabbitTemplate.convertAndSend("hello", "green,You have a message2");
        return product;
    }
}
