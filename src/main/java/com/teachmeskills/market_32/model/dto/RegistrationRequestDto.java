package com.teachmeskills.market_32.model.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
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

    @NotNull
    @Size(min = 2, max = 20)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 20)
    private String secondName;

    @Min(18)
    @Max(120)
    private Integer age;

    @Email
    private String email;
    private String gender;

    @Pattern(regexp = "[0-9]{12}")
    private String telephoneNumber;

    @NotNull
    @NotBlank
    private String login;

    @NotNull
    @NotBlank
    private String password;
}
