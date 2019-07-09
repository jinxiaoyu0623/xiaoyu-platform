package org.xiaoyu.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinxiaoyu
 * @date 2019/05/21 22:48
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name) {
        return "hello " + name;
    }

    @Value("${foo}")
    private String foo;

    @GetMapping("foo")
    public String foo() {
        return foo;
    }


}
