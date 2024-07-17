package com.revature.springdatademo;

import com.revature.springdatademo.models.User;
import com.revature.springdatademo.repos.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.revature.springdatademo.repos"})
public class SpringDataDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringDataDemoApplication.class, args);
		UserRepository repo = ac.getBean(UserRepository.class);
		User user = new User("Kyle", "Plummer", "kplummer", "password");

		System.out.println("Before: " + user);

		repo.save(user);

		System.out.println("After: " + user);
	}

}
