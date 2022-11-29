package com.elmasri.app.Rest.Models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nullName;
    @Column
    private String authorName;
    @Column
    private String bookName;
    @Column
    private String bookDetails;

    @Column
    private String authorBio;

    @Column
    private String publisher;

    public long getId() {
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getNullName() {
        return nullName;
    }
    public void setNullName(String nullName){
        this.nullName = nullName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public String getbookName() {
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public String getBookDetails() {
        return bookDetails;
    }
    public void setBookDetails(String bookDetails){
        this.bookDetails = bookDetails;
    }

    public String getAuthorBio() {
        return authorBio;
    }
    public void setAuthorBio(String authorBio){
        this.authorBio = authorBio;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

}
