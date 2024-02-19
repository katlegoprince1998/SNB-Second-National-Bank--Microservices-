package com.codeworld.roundupservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RoundUpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoundUpServiceApplication.class, args);
	}

}
