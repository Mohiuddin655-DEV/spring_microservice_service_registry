package com.example.spring_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServiceRegistryApplication.class, args);
	}

}
