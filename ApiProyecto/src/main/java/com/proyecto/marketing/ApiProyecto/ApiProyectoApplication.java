package com.proyecto.marketing.ApiProyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiProyectoApplication.class, args);
	}

}
