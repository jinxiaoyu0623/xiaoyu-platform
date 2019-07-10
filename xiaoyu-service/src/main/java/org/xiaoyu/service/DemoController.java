package org.xiaoyu.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinxiaoyu
 * @date 2019/07/10 09:41
 */
@RestController
public class DemoController {

    @SentinelResource("demo")
    @GetMapping("demo")
    public String demo() {
        return "demo";
    }
}
