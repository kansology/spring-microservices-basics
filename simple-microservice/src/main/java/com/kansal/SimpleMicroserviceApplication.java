package com.kansal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SimpleMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleMicroserviceApplication.class, args);
	}
}
