package fangfa.net.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: gl
 * @Email: 110.com
 * @version: 1.0
 * @Date: 2019/6/30
 * @describe: ribbon 实现负载均衡简单原理
 */
@RestController
public class ExtRibbonController {

    private DiscoveryClient discoveryClient;

    @Autowired
    public ExtRibbonController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    /**
     * 请求总数
     */
    private AtomicInteger requestCount = new AtomicInteger(1);

    /**
     * 根据服务的名称获取服务的地址,简单的负载均衡
     */
    private String getInstances() {
        List<ServiceInstance> instances = discoveryClient.getInstances("provider-server");
        if (isNotEmpty(instances)) {
            return "";
        }
        int serviceIndex = requestCount.get() % instances.size();
        return instances.get(requestCount.getAndIncrement()).getUri().toString();
    }


    private <T> boolean isNotEmpty(Collection<T> list) {
        return list != null && !list.isEmpty();
    }

}
