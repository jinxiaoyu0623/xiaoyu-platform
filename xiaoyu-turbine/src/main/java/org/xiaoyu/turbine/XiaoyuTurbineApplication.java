package org.xiaoyu.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@EnableHystrixDashboard
@EnableCircuitBreaker
@SpringBootApplication
public class XiaoyuTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoyuTurbineApplication.class, args);
    }

}
