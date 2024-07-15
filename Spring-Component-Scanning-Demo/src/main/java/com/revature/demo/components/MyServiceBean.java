package com.revature.demo.components;

import org.springframework.stereotype.Service;

@Service
public class MyServiceBean {
    public String test() {
        return "This is the service bean.";
    }
}
