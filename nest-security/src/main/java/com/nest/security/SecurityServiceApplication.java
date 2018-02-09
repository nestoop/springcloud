package com.nest.security;

import de.codecentric.boot.admin.config.EnableAdminServer;
import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author botter
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
public class SecurityServiceApplication implements CommandLineRunner{
	public static void main(String[] args) {
		IFunctionInterface<String, String> fi1 = (o) -> "hello1 function interface annotation" + o;
		System.out.println(fi1.test("000"));
		SpringApplication.run(SecurityServiceApplication.class, args);

	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("Security App started.......");
	}
}
