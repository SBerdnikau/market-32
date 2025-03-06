package com.teachmeskills.market_32.annotation;

import com.teachmeskills.market_32.servise.validator.AgeValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

//Собственная анотация для валидациив DTO
@Target({ElementType.FIELD}) // место где ставим анотацию
@Retention(RetentionPolicy.RUNTIME) //когда выполняется - во вреся работы программы
@Documented // могут пользоваться другие
@Constraint(validatedBy = {AgeValidator.class}) //хранит класс где есть метод с проверкой
public @interface CustomAge {
    String message() default "Age must be between 18 and 120";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
