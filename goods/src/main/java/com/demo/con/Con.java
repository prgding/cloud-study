package com.demo.con;

import com.demo.entity.Goods;
import com.demo.m.M;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dings
 * @since 2024/3/6 17:06
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/goods")
public class Con {
    private final M mapper;

    @RequestMapping("queryGoods")
    public String queryGoods(){
        Goods goods = mapper.selectById(1);
        return goods.toString();
    }
}