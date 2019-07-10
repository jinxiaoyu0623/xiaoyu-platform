package org.xiaoyu.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableDiscoveryClient
@SpringBootApplication
public class XiaoyuServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoyuServiceApplication.class, args);
    }

}
