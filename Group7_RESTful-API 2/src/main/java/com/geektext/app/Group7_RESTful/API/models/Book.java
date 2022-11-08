package com.geektext.app.Group7_RESTful.API.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String bookName;

    @Column
    private String bookAuthor;

    @Column
    private double bookPrice;

    @JsonIgnore
    @ManyToMany(mappedBy = "shoppingCart")
    private List<User> customers;

    public Book(){

    }

    public long getBookId() {
        return id;
    }

    public void setBookId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public List<User> getCustomers() {
        return customers;
    }

    public void setCustomers(List<User> customers) {
        this.customers = customers;
    }

    public void assignShoppingCartToUser(User user) {
        customers.add(user);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void deleteBookFromCart(User user) {
        customers.remove(user);
    }
}
