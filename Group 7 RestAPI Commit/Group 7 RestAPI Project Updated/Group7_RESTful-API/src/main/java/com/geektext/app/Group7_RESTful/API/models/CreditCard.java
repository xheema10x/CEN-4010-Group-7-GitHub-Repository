package com.geektext.app.Group7_RESTful.API.models;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CreditCard {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    private String creditCardNum;

    @Column
    private String creditCardExp;

    @Column
    private String creditCardPin;


}
