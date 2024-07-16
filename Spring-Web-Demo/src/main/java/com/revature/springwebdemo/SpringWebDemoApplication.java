package com.revature.springwebdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.revature.springwebdemo.beans"})
public class SpringWebDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringWebDemoApplication.class, args);
	}
}
