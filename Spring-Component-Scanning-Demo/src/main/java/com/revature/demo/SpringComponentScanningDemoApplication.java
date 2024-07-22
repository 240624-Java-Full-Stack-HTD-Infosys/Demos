package com.revature.demo;

import com.revature.demo.components.MyComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@SpringBootApplication(scanBasePackages = {"com.revature.demo.components"})
public class SpringComponentScanningDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringComponentScanningDemoApplication.class, args);

		MyComponent mc = ac.getBean(MyComponent.class);
		mc.test();




	}

}
