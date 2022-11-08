package com.geektext.app.Group7_RESTful.API.controller;

import com.geektext.app.Group7_RESTful.API.models.Book;
import com.geektext.app.Group7_RESTful.API.models.User;
import com.geektext.app.Group7_RESTful.API.repo.BookRepo;
import com.geektext.app.Group7_RESTful.API.repo.UserRepo;
import com.geektext.app.Group7_RESTful.API.service.BookService;
import com.geektext.app.Group7_RESTful.API.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController {

    @Autowired
    BookRepo bookRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    ShoppingCartService shoppingCartService;


    @PutMapping(value = "/book/{bookId}/user/{userId}")
    Book addBookToUserCart(@PathVariable Long bookId, @PathVariable Long userId){
        return shoppingCartService.addBookToCart(bookId, userId);
    }

    @DeleteMapping(value = "/book/{bookId}/user/{userId}")
    Book deleteBookFromUserCart(@PathVariable Long bookId, @PathVariable Long userId){
        return shoppingCartService.deleteBookToCart(bookId, userId);
    }
}
