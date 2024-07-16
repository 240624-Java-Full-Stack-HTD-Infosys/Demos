package com.revature.demo.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private MyControllerBean controller;
    private MyServiceBean service;
    private String message;

    public MyComponent(MyControllerBean controller, MyServiceBean service) {
        this.message = "";
        this.controller = controller;
        this.service = service;
    }

    public MyComponent() {
    }

    public MyControllerBean getController() {
        return controller;
    }

    @Autowired
    public void setController(MyControllerBean controller) {
        this.controller = controller;
    }

    public MyServiceBean getService() {
        return service;
    }


    @Autowired
    public void setService(MyServiceBean service) {
        this.service = service;
    }


    public void test() {
        System.out.println(this.controller.test());
        System.out.println(this.service.test());
    }
}
