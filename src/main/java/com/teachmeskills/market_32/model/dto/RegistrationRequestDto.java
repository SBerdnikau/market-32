package com.teachmeskills.market_32.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

//Data Transfer Object для регистрации
//сдесь заполняются поля
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class RegistrationRequestDto {
    private String firstName;
    private String secondName;
    private Integer age;
    private String email;
    private String gender;
    private String telephoneNumber;
    private String login;
    private String password;
    Model model; // для передачи параметров на страницу
    // ModelAndView model // для передачи параметров на страницу расширеный
}
