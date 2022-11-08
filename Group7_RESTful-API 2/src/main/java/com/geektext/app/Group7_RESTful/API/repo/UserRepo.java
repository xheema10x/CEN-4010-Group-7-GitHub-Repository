package com.geektext.app.Group7_RESTful.API.repo;

import com.geektext.app.Group7_RESTful.API.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
