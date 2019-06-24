package fangfa.net.cousumer.service.provider;


import fangfa.net.cousumer.hystrix.ConsumerFallbackImpl;
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
 * 当使用Feign与Hystrix回退时，在同一类型的ApplicationContext中有多个bean。
 * 这将导致@Autowired不起作用，因为没有一个bean，或者标记为主。
 * 要解决这个问题，Spring Cloud Netflix将所有Feign实例标记为@Primary，
 * 所以Spring Framework将知道要注入哪个bean。在某些情况下，这可能是不可取的。要关闭此行为，
 * 将@FeignClient的primary属性设置为false
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
