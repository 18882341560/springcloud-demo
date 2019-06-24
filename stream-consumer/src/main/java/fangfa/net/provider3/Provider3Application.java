package fangfa.net.provider3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Provider3Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider3Application.class, args);
    }

}
