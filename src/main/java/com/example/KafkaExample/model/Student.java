package com.example.KafkaExample.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
@Component
@NoArgsConstructor
public class Student {
    private String id=UUID.randomUUID().toString(),name,course;
}
