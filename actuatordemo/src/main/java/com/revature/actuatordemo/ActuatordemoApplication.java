package com.revature.actuatordemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication(scanBasePackages = {"com.revature.actuatordemo"})
public class ActuatordemoApplication {


	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(ActuatordemoApplication.class, args);
		MyService myService = ac.getBean(MyService.class);

	}

}
