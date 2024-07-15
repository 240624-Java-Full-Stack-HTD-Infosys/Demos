package com.revature;

import com.revature.config.BerryConfig;
import com.revature.models.Berry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(BerryConfig.class);
        Berry berry1 = (Berry)ac.getBean("myBerry");
        System.out.println(berry1);
    }
}
