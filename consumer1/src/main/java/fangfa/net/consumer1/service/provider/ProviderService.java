package fangfa.net.consumer1.service.provider;


import fangfa.net.consumer1.hystrix.ConsumerFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: green
 * @version: 1.0
 * @Date: 2019/6/18/018
 * @description: Feign方式 已经做了服务的负载均衡
 */
@FeignClient(name = "provider-server", path = "/provider",
        fallback = ConsumerFallbackImpl.class, primary = false)
@Component
public interface ProviderService {
    /**
     * 测试
     *
     * @param id id
     * @return 测试
     */
    @RequestMapping(value = "get_product", method = RequestMethod.GET)
    String getProduct(@RequestParam Long id);
}
