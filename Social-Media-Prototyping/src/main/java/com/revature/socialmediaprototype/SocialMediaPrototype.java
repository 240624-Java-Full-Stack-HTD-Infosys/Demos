package com.revature.socialmediaprototype;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.socialmediaprototype.models.User;
import com.revature.socialmediaprototype.repos.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = {"com.revature.socialmediaprototype.repos"})
public class SocialMediaPrototype {

	public static void main(String[] args) throws JsonProcessingException {
		ApplicationContext ac = SpringApplication.run(SocialMediaPrototype.class, args);

		User kyle = new User("kplummer", "password", new ArrayList<User>());
		User brit = new User("britmol", "password", new ArrayList<>());
		User waiyat = new User("waiyat", "password", new ArrayList<>());
		User sarina = new User("sarina", "password", new ArrayList<>());

		UserRepository repo = ac.getBean(UserRepository.class);

		List<User> kyleFollowing = new ArrayList<>();
		List<User> britFollowing = new ArrayList<>();
		List<User> waiyatFollowing = new ArrayList<>();
		List<User> sarinaFollowing = new ArrayList<>();

		repo.saveAndFlush(kyle);
		repo.saveAndFlush(brit);
		repo.saveAndFlush(waiyat);
		repo.saveAndFlush(sarina);


		kyleFollowing.add(brit);
		kyleFollowing.add(waiyat);
		kyleFollowing.add(sarina);
		kyle.setFollowing(kyleFollowing);

		britFollowing.add(waiyat);
		britFollowing.add(sarina);
		brit.setFollowing(britFollowing);

		waiyatFollowing.add(sarina);
		waiyatFollowing.add(kyle);
		waiyat.setFollowing(waiyatFollowing);

		sarinaFollowing.add(sarina);
		sarinaFollowing.add(brit);
		sarina.setFollowing(sarinaFollowing);

		repo.saveAndFlush(kyle);
		repo.saveAndFlush(brit);
		repo.saveAndFlush(waiyat);
		repo.saveAndFlush(sarina);


//		ObjectMapper mapper = new ObjectMapper();
//		System.out.println(mapper.writeValueAsString(repo.getUserByUsername("kplummer")));




	}

}
