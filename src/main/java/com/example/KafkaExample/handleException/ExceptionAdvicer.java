package com.example.KafkaExample.handleException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvicer {
    @ExceptionHandler(CustomException.class)
    public String handle(CustomException ce){
        return ce.getMessage();
    }
}
