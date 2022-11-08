package com.geektext.app.Group7_RESTful.API.controller;
import com.geektext.app.Group7_RESTful.API.models.CreditCard;
import com.geektext.app.Group7_RESTful.API.models.User;
import com.geektext.app.Group7_RESTful.API.repo.CreditCardRepo;
import com.geektext.app.Group7_RESTful.API.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserAPIController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @GetMapping(value = "/user/userName")
    public ResponseEntity<List<User>> getSingleUser(@RequestParam String userName){
        return new ResponseEntity<List<User>>(userRepo.findByUserName(userName), HttpStatus.OK);
    }

   // @GetMapping(value = "/credits/userName")
   // public List<CreditCard> getCards() {return CreditCardRepo.findAll()
   // }


    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user) {
        userRepo.save(user);
        return "Saved...";
    }

    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user) {
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setUserName(user.getUserName());
        updatedUser.setName(user.getName());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setHomeAddress(user.getHomeAddress());
        updatedUser.setCreditCard(user.getCreditCard());
        userRepo.save(updatedUser);
        return "Updated...";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id) {
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "Delete user with the id: " + id;
    }
}
