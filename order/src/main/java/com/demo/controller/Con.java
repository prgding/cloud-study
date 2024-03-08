package com.demo.controller;

import com.demo.entity.Order;
import com.demo.m.M;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dings
 * @since 2024/3/6 17:05
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class Con {
    private final M mapper;

    @RequestMapping("/queryOrder")
    public String queryOrder() {
        Order order = mapper.selectById(1);
        return order.toString();
    }

}
