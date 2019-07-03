package org.xiaoyu.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinxiaoyu
 * @date 2019/05/21 22:48
 */
@RestController
public class HelloController {

    @HystrixCommand(fallbackMethod = "error")
    @GetMapping("/hello")
    public String hello(String name) {
        name.equals("1");
        return "hello " + name;
    }

    public String error(String name) {
        return "error ";
    }

    @Value("${foo}")
    private String foo;

    @GetMapping("foo")
    public String foo() {
        return foo;
    }

}
