package com.nest.algorithm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * 算法 module
 * @author botter
 */
@SpringBootApplication
public class AlgorithmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println(OuJiLiDeAlgorithm.gcd(8, 3));
	}
}
