package com.geektext.app.Group7_RESTful.API.service;

import com.geektext.app.Group7_RESTful.API.models.User;
import com.geektext.app.Group7_RESTful.API.models.Book;
import com.geektext.app.Group7_RESTful.API.repo.BookRepo;
import com.geektext.app.Group7_RESTful.API.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {

    @Autowired
    private final BookRepo bookRepo;

    @Autowired
    public ShoppingCartService(BookRepo bookRepo, UserRepo userRepo) {
        this.bookRepo = bookRepo;
        this.userRepo = userRepo;
    }

    @Autowired
    private final UserRepo userRepo;
//Adding book to user cart
    public Book addBookToCart(Long bookId, Long userId){
        Book book = bookRepo.getReferenceById(bookId);
        User user = userRepo.getReferenceById(userId);
            book.assignShoppingCartToUser(user);
            user.addBooktoCart(book);
            userRepo.save(user);
            return bookRepo.save(book);
    }


    public Book deleteBookToCart(Long bookId, Long userId) {
        Book book = bookRepo.getReferenceById(bookId);
        User user = userRepo.getReferenceById(userId);
        book.deleteBookFromCart(user);
        user.deleteBookFromCart(book);
        userRepo.save(user);
        return bookRepo.save(book);
    }
}
