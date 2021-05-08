package com.example.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.example.learn"})
public class LearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
	}


}
