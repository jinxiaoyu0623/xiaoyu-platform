package org.xiaoyu.bus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class XiaoyuBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoyuBusApplication.class, args);
    }

    @Value("${foo}")
    private String foo;

    @GetMapping("/foo")
    public String foo() {
        return foo;
    }

}
