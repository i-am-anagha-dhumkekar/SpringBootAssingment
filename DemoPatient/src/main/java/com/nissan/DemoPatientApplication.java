package com.nissan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoPatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPatientApplication.class, args);
		System.out.println("Server is Running........");
	}

}
