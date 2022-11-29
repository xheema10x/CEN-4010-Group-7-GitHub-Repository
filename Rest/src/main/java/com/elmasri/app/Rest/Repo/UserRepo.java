package com.elmasri.app.Rest.Repo;

import com.elmasri.app.Rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {



}
