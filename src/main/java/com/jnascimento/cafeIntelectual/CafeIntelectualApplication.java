package com.jnascimento.cafeIntelectual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CafeIntelectualApplication {

	public static void main(String[] args) {
		SpringApplication.run(CafeIntelectualApplication.class, args);
	}

}
