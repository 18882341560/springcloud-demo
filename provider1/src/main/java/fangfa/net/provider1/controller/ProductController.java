package fangfa.net.provider1.controller;

import fangfa.net.provider1.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/hello")
    public String hello(){
        return "provider1-hello";
    }


}
