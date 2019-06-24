package fangfa.net.provider3.controller;

import fangfa.net.provider3.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: green
 * @version: 1.0
 * @Date: 2019/6/18/018
 * @description:
 */
@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/get_product")
    public String getProduct(@RequestParam(value = "id") Long id) {
        return productService.getById(id).toString();
    }
}
