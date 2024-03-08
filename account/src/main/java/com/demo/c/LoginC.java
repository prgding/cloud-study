package com.demo.c;

import cn.hutool.jwt.JWT;
import com.demo.entity.Account;
import com.demo.entity.R;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

/**
 * @author dings
 * @since 2024/3/7 11:20
 */
@RestController
@RequestMapping("/account")
public class LoginC {
    @RequestMapping(value = "/login")
    public R login(@RequestBody Account act) {
        if (!act.getUsername().equals("admin") || !act.getPassword().equals("admin")) {
            return new R().error("用户名或密码错误");
        }
        HashMap<String, String> map = new HashMap<>();
        String token = JWT.create()
                .setPayload("username", act.getUsername())
                .setPayload("password", act.getPassword())
                // 设置过期时间为1分钟
                .setExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60))
                .setKey("123".getBytes())
                .sign();
        map.put("token", token);
        return new R().ok(map);
    }
}
