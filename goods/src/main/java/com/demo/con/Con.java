package com.demo.con;

import com.demo.client.OrderClient;
import com.demo.entity.CsGoods;
import com.demo.m.M;
import com.demo.utils.UserContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dings
 * @since 2024/3/6 17:06
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/goods")
@Slf4j
public class Con {
    private final M mapper;
    private final OrderClient orderClient;

    @RequestMapping("queryGoods")
    public String queryGoods(@RequestHeader("user-info") String userInfo) {
        log.info("userInfo = {}", userInfo);
        CsGoods csGoods = mapper.selectById(1);
        return csGoods.toString();
    }

    @RequestMapping("queryOrder")
    public String queryOrder() {
        System.out.println("goodsUserInfo = " + UserContext.getUserInfo());
        return orderClient.invokeQueryOrder();
    }
}