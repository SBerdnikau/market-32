package com.teachmeskills.market_32.servise;

import com.teachmeskills.market_32.repository.SecurityRepository;
import com.teachmeskills.market_32.utils.SQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;

@Service //Хранит бизес-логику
public class SecurityService {

    public final SecurityRepository securityRepository;

    @Autowired
    public SecurityService(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
    }

   public Boolean registration(String firstName, String secondName, Integer age, String email, String gender, String telephoneNumber,  String login, String password)  {
       try {
           return securityRepository.registration(firstName, secondName, age, email, gender, telephoneNumber, login, password);
       } catch (SQLException e) {
           System.out.println(e.getMessage());
           return false;
       }
   }

}
