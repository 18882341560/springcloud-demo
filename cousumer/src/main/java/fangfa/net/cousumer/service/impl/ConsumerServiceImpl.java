package fangfa.net.cousumer.service.impl;

import fangfa.net.cousumer.service.ConsumerService;
import fangfa.net.cousumer.service.provider.ProviderService;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: green
 * @version: 1.0
 * @Date: 2019/6/19/019
 * @description:
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    private ProviderService providerService;

    @Autowired
    public ConsumerServiceImpl(ProviderService providerService) {
        this.providerService = providerService;
    }


    /**
     * 测试
     *
     * @return 测试数据
     * @throws Exception e
     */
    @Override
    public String getConsumer() throws Exception {
        long random = (RandomUtils.nextLong(1, 100));
        return providerService.getProduct(random);
    }
}
