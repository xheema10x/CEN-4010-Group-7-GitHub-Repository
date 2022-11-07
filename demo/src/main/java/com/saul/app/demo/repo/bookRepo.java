package com.saul.app.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.saul.app.demo.Models.book;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

// This is just the repository

public interface bookRepo extends JpaRepository<book, Long> {
    List<book> findByGenre(String genre);

    @Query(value = "SELECT * FROM geek_text.book ORDER BY sold_copies DESC LIMIT 10", nativeQuery = true)
    List<book> findBysold_copies();
}
