package org.xiaoyu.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class XiaoyuZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoyuZipkinApplication.class, args);
    }

}
