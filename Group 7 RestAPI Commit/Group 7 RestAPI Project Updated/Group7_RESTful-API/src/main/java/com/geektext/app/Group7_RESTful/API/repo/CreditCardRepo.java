package com.geektext.app.Group7_RESTful.API.repo;
import com.geektext.app.Group7_RESTful.API.models.CreditCard;
import com.geektext.app.Group7_RESTful.API.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreditCardRepo extends JpaRepository<CreditCard, Long> {


}
