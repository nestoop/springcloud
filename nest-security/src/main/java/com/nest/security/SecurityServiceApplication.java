package com.nest.security;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.beans.factory.annotation.Autowired;
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
public class SecurityServiceApplication implements CommandLineRunner{

	@Autowired
	private DataConfig dataConfig;

	public static void main(String[] args) {
		IFunctionInterface<String, String> fi1 = (o) -> "hello1 function interface annotation" + o;
		System.out.println(fi1.test("000"));
		SpringApplication.run(SecurityServiceApplication.class, args);

	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println(dataConfig.getPassword());
	}
}
