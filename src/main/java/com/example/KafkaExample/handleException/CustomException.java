package com.example.KafkaExample.handleException;

public class CustomException extends RuntimeException{

    String message;

    public CustomException(String message) {

        this.message = message;
    }
}
