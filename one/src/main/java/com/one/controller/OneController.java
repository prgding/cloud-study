package com.one.controller;

import com.one.feign.BProject;
import com.one.service.OneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dings
 * @since 2024/1/13 15:18
 */
@RestController
@RequiredArgsConstructor
public class OneController {
    private final OneService service;
    private final BProject bProject;

    @RequestMapping("/one")
    public String one() {
        return service.one();
    }

    @RequestMapping("/two")
    public String two(){
        return bProject.invokeB();
    }
}
