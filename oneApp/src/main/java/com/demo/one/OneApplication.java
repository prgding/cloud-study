package com.demo.one;

import com.demo.config.DefaultFeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dingshuai
 */

@SpringBootApplication
@EnableFeignClients(basePackages = "com.demo.client", defaultConfiguration = DefaultFeignConfig.class)
public class OneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class, args);
    }

}
