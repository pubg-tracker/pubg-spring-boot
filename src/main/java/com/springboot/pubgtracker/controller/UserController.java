package com.springboot.pubgtracker.controller;

import com.springboot.pubgtracker.model.LoginUser;
import com.springboot.pubgtracker.model.User;
import com.springboot.pubgtracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") Long userId){
        return userService.findById(userId);
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PostMapping("/validate")
    public User validateUser(@RequestBody LoginUser loginUser){
        User user = userService.validateUser(loginUser.getEmailAddress());
        if(user.getPassword().equals(loginUser.getPassword()))
            return user;
        return null;
    }
}
