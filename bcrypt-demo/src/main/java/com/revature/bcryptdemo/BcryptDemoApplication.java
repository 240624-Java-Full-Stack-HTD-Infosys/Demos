package com.revature.bcryptdemo;

import com.revature.bcryptdemo.beans.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BcryptDemoApplication {

	/*
	Documentation can be found in github:
		https://github.com/patrickfav/bcrypt
	 */

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(BcryptDemoApplication.class, args);
		MyService service = ac.getBean(MyService.class);


	}

}
