package com.yash.sm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.yash.sm")
public class SchoolManagmentErpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagmentErpApplication.class, args);
	}
}
