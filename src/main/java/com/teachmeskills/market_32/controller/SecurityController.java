package com.teachmeskills.market_32.controller;

import com.teachmeskills.market_32.model.dto.RegistrationRequestDto;
import com.teachmeskills.market_32.servise.SecurityService;
import jakarta.validation.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

@Controller
@RequestMapping("security") // крефикс к URI пятям контроллера - security/registration
public class SecurityController {

    public SecurityService securityService;

    //подключаем сервис
    @Autowired
    public SecurityController(SecurityService securityService) {
        this.securityService = securityService;
    }

    //как передать параметры:
    // 1 registration(@PathVariable("id") Integer id) ->  "/registration/123" как часть пути
    // 2 registration(@RequestParam("id") Integer id) -> "/registration?var=123" после основного пути как параметр или из Body

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    //handlerMapping -Метод на который должен отработать контроллер через GET/Post
    //возвращает страницу - user
    //@ModelAttribute для заполнения параметров через обьект DTO
    @PostMapping("/registration")
    public String registration(@ModelAttribute RegistrationRequestDto requestDto) {
        //Boolean result  = securityService.registration(firstName, secondName, age, email, gender, telephoneNumber, login, password);
        //model.addAttribute("result", result); // return String
       // Model model; // для передачи параметров на страницу
        // ModelAndView model // для передачи параметров на страницу расширеный
       // model.addObject("result", result); //return ModelAndView
       // model.setViewName("user");
        System.out.println("Registration request: " + requestDto);
        return "user";
    }

}
