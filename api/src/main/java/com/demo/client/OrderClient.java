package com.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dings
 * @since 2024/3/10 13:14
 */
@FeignClient(value = "order")
public interface OrderClient {
    @RequestMapping("order/queryOrder")
    String invokeQueryOrder();
}
