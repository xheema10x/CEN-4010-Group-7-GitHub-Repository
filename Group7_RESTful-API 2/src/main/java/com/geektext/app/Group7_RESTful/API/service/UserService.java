package com.geektext.app.Group7_RESTful.API.service;

import com.geektext.app.Group7_RESTful.API.models.User;
import com.geektext.app.Group7_RESTful.API.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public List<User> getUsers(){
        return userRepo.findAll();
    }

    public String addNewUser(@RequestBody User user){
        userRepo.save(user);
        return "Saved user...";
    }

}
