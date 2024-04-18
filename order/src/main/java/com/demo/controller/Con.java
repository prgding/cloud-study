package com.demo.controller;

import com.demo.entity.CsOrder;
import com.demo.m.M;
import com.demo.utils.UserContext;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dings
 * @since 2024/3/6 17:05
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("order")
public class Con {
    private final M mapper;

    @RequestMapping("queryOrder")
    public String queryOrder() {
        System.out.println("OrderUserInfo = " + UserContext.getUserInfo());
        CsOrder csOrder = mapper.selectById(1);
        return csOrder.toString() + UserContext.getUserInfo();
    }
}
