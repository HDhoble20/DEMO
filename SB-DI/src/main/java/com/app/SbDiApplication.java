package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.app","p1.p2"})
public class SbDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbDiApplication.class, args);
	}

}
