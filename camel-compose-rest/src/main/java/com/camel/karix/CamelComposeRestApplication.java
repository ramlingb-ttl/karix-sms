package com.camel.karix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath:spring/camel-context.xml" })
public class CamelComposeRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelComposeRestApplication.class, args);
	}
}