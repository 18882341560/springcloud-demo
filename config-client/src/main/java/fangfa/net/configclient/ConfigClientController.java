package fangfa.net.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: gl
 * @Email: 110.com
 * @version: 1.0
 * @Date: 2019/8/4
 * @describe:
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${gl}")
    private String serverPort;


    @RequestMapping("/get_config_name")
    public String getConfigName() {
        return serverPort;
    }


}
