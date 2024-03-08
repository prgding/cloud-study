package com.demo.filter;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONUtil;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTValidator;
import cn.hutool.jwt.signers.JWTSignerUtil;
import com.demo.entity.R;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @author dings
 * @since 2024/3/7 11:11
 */
@Component
@RequiredArgsConstructor
public class AuthGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("filter executed");
        // 1.获取Request
        ServerHttpRequest request = exchange.getRequest();
        // 2.判断是否不需要拦截
        System.out.println("request.getPath() = " + request.getPath());
        if (request.getPath().toString().equals("/account/login")) {
            // 无需拦截，直接放行
            System.out.println("无需拦截，直接放行");
            return chain.filter(exchange);
        }
        // 3.获取请求头中的token
        String token = null;
        HttpHeaders headers = request.getHeaders();
        System.out.println(headers);
        List<String> tokenHeaders = headers.get("token");
        if (!CollUtil.isEmpty(tokenHeaders)) {
            token = tokenHeaders.get(0);
        }
        // 4.校验并解析token
        try {
            JWTValidator.of(token).validateAlgorithm(JWTSignerUtil.hs256("123".getBytes())).validateDate(DateUtil.date());
        } catch (Exception e) {
            // 如果无效，拦截
            ServerHttpResponse response = exchange.getResponse();
            response.setRawStatusCode(401);
            String rJson = JSONUtil.toJsonStr(new R().error("token无效"));
            response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
            return response.writeWith(Mono.just(response.bufferFactory().wrap(rJson.getBytes())));
        }

        System.out.println("jwt: " + JWT.of(token).getPayload());
        // 6.放行
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
