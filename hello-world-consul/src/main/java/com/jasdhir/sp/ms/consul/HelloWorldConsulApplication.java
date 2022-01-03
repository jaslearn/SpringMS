package com.jasdhir.sp.ms.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloWorldConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldConsulApplication.class, args);
	}

}
