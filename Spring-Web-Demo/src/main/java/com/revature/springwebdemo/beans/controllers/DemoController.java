package com.revature.springwebdemo.beans.controllers;

import com.revature.springwebdemo.model.AuthDto;
import com.revature.springwebdemo.model.User;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class DemoController {
    private final List<User> userList = new ArrayList<>();

    /*
    We do the same stuff here as we did with Javalin, two different tools with different syntax to
    accomplish the same things. So what are those things?
     - request and response body - We can use @RequestBody, @ResponseBody, or we can bring in the HttpServletRequest and HttpServletResponse objects
     - cookies
     - parameters
       - path params - @PathVariable in parameter list
       - query params - @RequestParam in parameter list
     - status codes
     - headers
     */


    public DemoController() {
        System.out.println("controller ");
    }

    @GetMapping(path = "/ping")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public @ResponseBody String ping(HttpServletRequest req, HttpServletResponse resp) {
        resp.addHeader("Content-Type", "application/json");
        return "{ \"response\": \"Pong!\"}";
    }

    @PostMapping("/users")
    public @ResponseBody User postNewUser(@RequestBody User newUser) {
        this.userList.add(newUser);
        return newUser;
    }

    @GetMapping("/users")
    public @ResponseBody List<User> getAllUsers() {
        return userList;
    }

    @GetMapping("/users/{username}")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody User getUserByUsername(@PathVariable String username) {
        for(User user : userList) {
            if(user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @GetMapping("/users/query")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody User queryUsers(@RequestParam String username) {
        for(User user : userList) {
            if(user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @PostMapping("/set-cookie")
    @ResponseStatus(HttpStatus.OK)
    public void generateCookies(@RequestBody AuthDto auth, HttpServletResponse resp) {
        if(auth.getUsername().equals("kplummer") && auth.getPassword().equals("password")) {
            Cookie cookie = new Cookie("Key1", "Val1");
            Cookie cookie2 = new Cookie("Key2", "Val2");
            resp.addCookie(cookie);
            resp.addCookie(cookie2);
        }
    }

    @GetMapping("/get-cookie")
    @ResponseStatus(HttpStatus.OK)
    public Set<String> parseCookies(@CookieValue("Key1") String key1, @CookieValue("Key2") String something, HttpServletRequest req) {
        Set<String> valueSet = new HashSet<>();
        valueSet.add(key1);
        valueSet.add(something);

        Cookie[] cookieArray = req.getCookies();
        for(Cookie cookie : cookieArray) {
            valueSet.add(cookie.getValue());
        }

        return valueSet;
    }

    @GetMapping("/cause-error")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public String causeError() throws Exception {
        throw new Exception("This is the exception message");
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String serverError() {
        //log some debug info
        //graceful recovery?
        return "There was a generic server error.";
    }

}
