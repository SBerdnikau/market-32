package com.teachmeskills.market_32.utils;

public interface SQLQuery {
    String CREATE_USER = "INSERT INTO users(id, first_name, second_name, age, email, gender, telephone_number, created_at, updated_at, is_deleted) VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, DEFAULT, ?, ?)";
    String CREATE_SECURITY = "INSERT INTO security(id, login, password, role, created_at, updated_at, user_id) VALUES (DEFAULT, ?, ?, ?, DEFAULT, ?, ?)";
}
