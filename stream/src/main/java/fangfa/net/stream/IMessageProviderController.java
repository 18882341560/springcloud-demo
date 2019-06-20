package fangfa.net.stream;

import fangfa.net.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: green
 * @version: 1.0
 * @Date: 2019/6/20/020
 * @description:
 */
@RestController
public class IMessageProviderController {

    private IMessageProvider iMessageProvider;

    @Autowired
    public IMessageProviderController(IMessageProvider iMessageProvider) {
        this.iMessageProvider = iMessageProvider;
    }


    @GetMapping("/send")
    public String send() {
        Product product = new Product();
        product.setId(1L);
        product.setAge(26);
        product.setName("green");
        iMessageProvider.send(product);
        return "发送成功";
    }
}
