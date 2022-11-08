package com.geektext.app.Group7_RESTful.API.service;

import com.geektext.app.Group7_RESTful.API.models.Book;
import com.geektext.app.Group7_RESTful.API.models.User;
import com.geektext.app.Group7_RESTful.API.repo.BookRepo;
import com.geektext.app.Group7_RESTful.API.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookService {

    private final BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Autowired
    UserRepo userRepo;

    public List<Book> getBooks() {
        return bookRepo.findAll();
    }


    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    public String updateBook(@PathVariable long id, @RequestBody Book book) {
        Book updatedBook = bookRepo.findById(id).get();
        updatedBook.setBookName(book.getBookName());
        updatedBook.setBookAuthor(book.getBookAuthor());
        updatedBook.setBookPrice(book.getBookPrice());
        bookRepo.save(updatedBook);
        return "Updated Book...";
    }

    public String deleteBook(@PathVariable long id) {
        Book deleteBook = bookRepo.findById(id).get();
        bookRepo.delete(deleteBook);
        return "Delete book with the id: " + id;
    }

}

