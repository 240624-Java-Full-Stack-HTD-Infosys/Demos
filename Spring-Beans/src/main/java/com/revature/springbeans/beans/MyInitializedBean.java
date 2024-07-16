package com.revature.springbeans.beans;

import org.springframework.beans.factory.InitializingBean;

/*
this is how we can "hook" into the initialization process of bean lifecycle
 */
public class MyInitializedBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is the initializer method");
    }
}
