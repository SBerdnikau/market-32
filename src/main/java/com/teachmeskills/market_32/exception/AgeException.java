package com.teachmeskills.market_32.exception;

/**
 *  исключения для возраста
 */
public class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "AgeException: Age is incorrect!";
    }
}
