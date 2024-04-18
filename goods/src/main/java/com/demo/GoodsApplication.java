package com.demo;

import com.demo.config.DefaultFeignConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dings
 * @since 2024/3/6 17:11
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.demo.client", defaultConfiguration = DefaultFeignConfig.class)
@MapperScan("com.demo.m")
public class GoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
    }
}
