package com.example.demoMS3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoMs3Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoMs3Application.class, args);
	}

}
