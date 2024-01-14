package com.one.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dings
 * @since 2024/1/13 18:13
 */
@FeignClient(value = "b")
public interface BProject {
    @RequestMapping("/two")
    String invokeB();
}
