package com.demo.config;

import com.demo.utils.UserContext;
import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dings
 * @since 2024/2/28 10:47
 */
@Configuration
@EnableFeignClients(defaultConfiguration = DefaultFeignConfig.class)
public class DefaultFeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public RequestInterceptor userInfoRequestInterceptor() {
        return requestTemplate -> {
            System.out.println("userInfoRequestInterceptor executed");
            requestTemplate.header("user-info", UserContext.getUserInfo());
        };
    }
}
