package com.teachmeskills.market_32.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Data //создаёт сетеры и ретеры и констукторы, equals, hashcode, toString - lombok
@NoArgsConstructor //Не создавать конструктор без аргументов, нужен Спрингу чтобы он определил его как Bean - lombok
@AllArgsConstructor// Создать конструктор со всеми аргументами, если нужно парсить через JDBC
@Component
public class User {
    private Long id;
    private String firstName;
    private String secondName;
    private Integer age;
    private String email;
    private String gender;
    private String telephoneNumber;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Security securityInfo;
    private Boolean isDeleted;
}
