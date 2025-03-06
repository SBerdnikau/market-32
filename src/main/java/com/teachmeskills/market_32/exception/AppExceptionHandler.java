package com.teachmeskills.market_32.exception;

//общий обработчик для всего приложения

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//2 вариант и предпочтительный, в отдельном классе обработчик ошибок
@ControllerAdvice //ставится над классом для обработки Исключений
public class AppExceptionHandler {

    @ExceptionHandler(value = AgeException.class) // привязывает класс исключение к обработчику
    public ModelAndView securityExceptionHandler(AgeException error){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", error.getMessage());
        modelAndView.setStatus(HttpStatus.BAD_REQUEST);
        modelAndView.setViewName("error");
        return modelAndView;
    }

    public ModelAndView allExceptionHandler(Exception error){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", error.getMessage());
        modelAndView.setStatus(HttpStatus.BAD_REQUEST);
        modelAndView.setViewName("error");
        return modelAndView;
    }

}
