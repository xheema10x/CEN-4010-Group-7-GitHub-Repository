package com.geektext.app.Group7_RESTful.API.controller;

import com.geektext.app.Group7_RESTful.API.models.User;
import com.geektext.app.Group7_RESTful.API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/saveUser")
    public void registerNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }






}
