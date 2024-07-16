package com.revature.springbeans.beans;

import org.springframework.beans.factory.DisposableBean;

public class MyDestroyableBean implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("This is destruction...");
    }
}
