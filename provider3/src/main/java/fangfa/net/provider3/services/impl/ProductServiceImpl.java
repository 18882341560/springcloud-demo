package fangfa.net.provider3.services.impl;

import fangfa.net.model.Product;
import fangfa.net.provider3.services.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author: green
 * @version: 1.0
 * @Date: 2019/6/18/018
 * @description:
 */
@Service
public class ProductServiceImpl implements ProductService {

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
        product.setName("green3");
        return product;
    }
}
