package com.geektext.app.Group7_RESTful.API.controller;

import com.geektext.app.Group7_RESTful.API.models.Book;
import com.geektext.app.Group7_RESTful.API.repo.BookRepo;
import com.geektext.app.Group7_RESTful.API.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepo bookRepo;

    @Autowired
    BookService bookService;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome to our Group 7 Team Project!";
    }

    @GetMapping(value = "/books")
    public List<Book> getBooks(){
        return bookRepo.findAll();
    }


    @PostMapping(value = "/saveBook")
    public void saveBook(@RequestBody Book book){
        bookService.addBook(book);
    }


    @PutMapping(value = "update/{id}")
    public String updateBook(@PathVariable long id, @RequestBody Book book){
        return bookService.updateBook(id, book);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteBook(@PathVariable long id){
        return bookService.deleteBook(id);
    }

}
