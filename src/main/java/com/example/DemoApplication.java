package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.Out.Println("Hello from Spring Application!");
		SpringApplication.run(DemoApplication.class, args);
	}
}
