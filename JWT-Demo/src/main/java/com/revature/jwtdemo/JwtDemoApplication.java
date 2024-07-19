package com.revature.jwtdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication(scanBasePackages = {
		"com.revature.jwtdemo.controllers",
		"com.revature.jwtdemo.services"
})
public class JwtDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(JwtDemoApplication.class, args);
//		Environment env = ac.getBean(Environment.class);
//		String username = env.getProperty("un");
//		String password = env.getProperty("password");
//		String secretWord = env.getProperty("secret-word");
//		System.out.println(username + " " + secretWord + " " + secretWord);
	}

}
