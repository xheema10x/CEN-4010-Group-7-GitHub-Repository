package com.geektext.app.Group7_RESTful.API.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String email;

    @Column
    private String fullName;

    @Column
    private String homeAddress;

    @ManyToMany
    @JoinTable(
            name = "userCart",
            joinColumns = @JoinColumn(name= "user_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book> shoppingCart;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public List<Book> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Book> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addBooktoCart(Book book) {
        shoppingCart.add(book);
    }


    public void deleteBookFromCart(Book book) {
        shoppingCart.remove(book);
    }
}
