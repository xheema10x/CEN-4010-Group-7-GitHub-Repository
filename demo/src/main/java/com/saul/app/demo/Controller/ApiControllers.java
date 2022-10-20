package com.saul.app.demo.Controller;

import com.saul.app.demo.Models.book;
import com.saul.app.demo.repo.bookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private bookRepo bookRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping(value = "/users")
    public List<book> getUsers() {
        return bookRepo.findAll();
    }

    @Autowired
    bookRepo bRepo;

    @GetMapping("/booksBy/name")
    public ResponseEntity<List<book>> getByGenre(@RequestParam String genre) {
        return new ResponseEntity<List<book>>(bRepo.findByGenre(genre),HttpStatus.OK);
    }


    @GetMapping("/top")
    public ResponseEntity<List<book>> getTop() {
        return new ResponseEntity<List<book>>(bookRepo.findBysold_copies(), HttpStatus.OK);
    }
}
