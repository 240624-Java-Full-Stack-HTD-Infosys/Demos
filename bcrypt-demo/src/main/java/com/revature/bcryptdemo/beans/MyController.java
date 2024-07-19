package com.revature.bcryptdemo.beans;

import com.revature.bcryptdemo.dtos.AuthDto;
import com.revature.bcryptdemo.exceptions.BadAuthException;
import com.revature.bcryptdemo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public User register(@RequestBody User user) {
        return this.myService.registerAuth(user);
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public String login(@RequestBody AuthDto authDto) throws BadAuthException {
        if(!myService.login(authDto)) {
            throw new BadAuthException("Bad username or password");
        }
        return "Success! Access Granted!";
    }

    @ExceptionHandler(BadAuthException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String badAuthExceptionHandler(BadAuthException e) {
        return e.getMessage();
    }

}
