package fangfa.net.consumer1.hystrix;

import fangfa.net.consumer1.service.provider.ProviderService;
import org.springframework.stereotype.Component;

/**
 * @author: green
 * @version: 1.0
 * @Date: 2019/6/19/019
 * @description:
 */
@Component
public class ConsumerFallbackImpl implements ProviderService {
    /**
     * 熔断测试
     *
     * @param id id
     * @return 熔断测试
     */
    @Override
    public String getProduct(Long id) {
        return "熔断测试1--参数:" + id;
    }
}
