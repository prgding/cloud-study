package com.demo.two.con;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dings
 * @since 2024/2/14 16:39
 */
@RestController
public class Controller {
    @RequestMapping("/twoUrl")
    public String two() {
        return "This is from twoApp project";
    }
}
