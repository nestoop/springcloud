package com.nest.zuul.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author botter
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NestZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NestZuulGatewayApplication.class, args);
	}
}
