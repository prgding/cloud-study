package com.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dings
 * @since 2024/2/14 16:41
 */
@FeignClient(value = "twoApp")
public interface TwoFeignController {
    @RequestMapping("/twoUrl")
    String invokeTwo();
}
