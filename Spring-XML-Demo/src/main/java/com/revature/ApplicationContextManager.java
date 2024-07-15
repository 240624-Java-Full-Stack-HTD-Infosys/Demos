package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextManager {
    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        if(applicationContext == null) {
            ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
        }
        return applicationContext;
    }

    public static ApplicationContext getApplicationContext(String filename) {
        if(applicationContext == null) {
            ApplicationContext ac = new ClassPathXmlApplicationContext(filename);
        }
        return applicationContext;
    }
}
