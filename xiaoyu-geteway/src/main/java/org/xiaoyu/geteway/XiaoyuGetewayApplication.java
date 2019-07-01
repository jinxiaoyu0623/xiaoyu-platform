package org.xiaoyu.geteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XiaoyuGetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoyuGetewayApplication.class, args);
    }

}
