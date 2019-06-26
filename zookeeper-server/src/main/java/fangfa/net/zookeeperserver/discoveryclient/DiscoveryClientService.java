package fangfa.net.zookeeperserver.discoveryclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: gl
 * @Email: 110.com
 * @version: 1.0
 * @Date: 2019/6/26
 * @describe:
 */
@Service
public class DiscoveryClientService {

    private DiscoveryClient discoveryClient;

    @Autowired
    public DiscoveryClientService(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    /**
     * 获取服务端的一些信息
     */
    public void listDiscoveryClientService() {
        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("consumer-server");
        System.out.println(serviceInstanceList);
    }
}
