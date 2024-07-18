package com.revature.springdatademo;

import com.revature.springdatademo.models.Task;
import com.revature.springdatademo.models.User;
import com.revature.springdatademo.repos.TaskRepository;
import com.revature.springdatademo.repos.UserRepository;
import com.revature.springdatademo.services.MyService;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
Recall the Jackson FasterXML ObjectMapper
ORM - Object Relational Mapper

 */
@SpringBootApplication(scanBasePackages = {
		"com.revature.springdatademo.repos",
		"com.revature.springdatademo.services"
})
public class SpringDataDemoApplication {

	public static void main(String[] args) throws InterruptedException {

		ApplicationContext ac = SpringApplication.run(SpringDataDemoApplication.class, args);
		UserRepository userRepo = ac.getBean(UserRepository.class);
		TaskRepository taskRepo = ac.getBean(TaskRepository.class);
		MyService service = ac.getBean(MyService.class);
		User user = new User("Kyle", "Plummer", "kplu", "password");

		List<Task> taskList = new ArrayList<>();
		taskList.add(new Task("walk the dog", "Take the dog for a long walk, he's earned it.", false, user));
		taskList.add(new Task("register car", "get DMV appt and get some new plates for the car.", false, user));
		taskList.add(new Task("car inspection", "take the car to Gill's for an inspection and oil change", false, user));

		user.setTasks(taskList);


		System.out.println("\n\nBefore: " + user);
		userRepo.saveAndFlush(user);
		taskRepo.saveAllAndFlush(taskList);
		System.out.println("After: " + user + "\n\n");

	}

}
