package com.revature.springbeans.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("singleton")//singletons are "eager" by default.
//@Lazy
@Controller
public class MyController {
    MyService myService;

    @Autowired//Hey spring please give this class its dependencies
    public MyController(MyService myService) {
        System.out.println("Controller Constructor...");
        this.myService = myService;
    }
}
