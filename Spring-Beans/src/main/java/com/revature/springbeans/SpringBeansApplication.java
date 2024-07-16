package com.revature.springbeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/*
Bean scopes:
 - Prototype - Every time we need one of these, spring instantiates and gives a new copy
 - Singleton - Every time we need one of these, spring gives us the same one over and over...
               There will only ever be exactly one of these

Also there are less important others...
 - HttpSessionScope
 - WebAwareSessionScope
 */



@SpringBootApplication(scanBasePackages = {"com.revature.springbeans.beans"})
public class SpringBeansApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBeansApplication.class, args);


	}

}
