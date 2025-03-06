package com.teachmeskills.market_32.servise.validator;

import com.teachmeskills.market_32.annotation.CustomAge;
import jakarta.validation.ConstraintValidator;
//ConstraintValidator<CustomAge, Integer> - принимает тип анотации и кокого тип поля хранит
public class AgeValidator implements ConstraintValidator<CustomAge, Integer> {

}
