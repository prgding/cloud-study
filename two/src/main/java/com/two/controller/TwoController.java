package com.two.controller;


import com.two.service.TwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dings
 * @since 2024/1/13 15:34
 */

@RestController
public class TwoController {
    @Autowired
    private TwoService service;

    @RequestMapping("/two")
    public String second() {
        System.out.println("con");
        return service.two();
    }
}
