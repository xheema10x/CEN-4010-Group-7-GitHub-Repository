package com.elmasri.app.Rest.Controller;

import com.elmasri.app.Rest.Models.User;
import com.elmasri.app.Rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage(){

        return "Welcome";

    }

    @GetMapping(value = "/users")
    public List<User> getUsers(){

        return userRepo.findAll();

    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user){

        userRepo.save(user);
        return "Saved...";

    }
    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){

        User updatedUser = userRepo.findById(id).get();
        updatedUser.setNullName(user.getNullName());
        updatedUser.setAuthorName(user.getAuthorName());
        updatedUser.setBookDetails(user.getBookDetails());
        updatedUser.setBookName(user.getbookName());
        updatedUser.setAuthorBio(user.getAuthorBio());
        updatedUser.setPublisher(user.getPublisher());
        userRepo.save(updatedUser);
        return "Updated...";

    }
    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id){

        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "Deleted user with the id: " + id;

    }

}
