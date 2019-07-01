package org.xiaoyu.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class XiaoyuAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiaoyuAdminApplication.class, args);
	}

}
