package com.demo.one.con;

import com.demo.client.TwoFeignController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dings
 * @since 2024/2/14 16:43
 */
@RestController
@RequiredArgsConstructor
public class Controller {
    private final TwoFeignController twoFeignController;

    @RequestMapping("/one")
    public String one() {
        return "From oneApp";
    }

    @RequestMapping("/two")
    public String two() {
        return twoFeignController.invokeTwo();
    }
}
