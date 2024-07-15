package com.revature.demo.components;

import org.springframework.stereotype.Controller;

@Controller
public class MyControllerBean {
    public String test() {
        return "This is the controller bean.";
    }
}
