package com.slb.spring.boot.controller;


import com.slb.spring.boot.domain.User;
import com.slb.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

   //@RequestMapping(path = "/user", method = RequestMethod.GET) alternative way
    @GetMapping("/user")
    public User getUser(){
        return userService.getUser("1");
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/user")
    public User getUser(@RequestBody(required = true)  User user){
        System.out.println("executing post user with " + user.toString());
        userService.createUser(user);
        return user;
    }

}
