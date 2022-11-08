package com.geektext.app.Group7_RESTful.API.models;
import javax.persistence.*;

@Entity
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    public Long getid() {
        return id;
    }

    public void setU_id(Long id) {
        this.id = id;
    }


    @Column
    private String userName;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String homeAddress;

    @Column
    private String creditCard;




    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
}
