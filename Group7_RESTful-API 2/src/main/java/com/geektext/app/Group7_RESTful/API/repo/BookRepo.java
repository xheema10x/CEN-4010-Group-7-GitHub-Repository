package com.geektext.app.Group7_RESTful.API.repo;

import com.geektext.app.Group7_RESTful.API.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
