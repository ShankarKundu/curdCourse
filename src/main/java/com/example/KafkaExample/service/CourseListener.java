package com.example.KafkaExample.service;

import com.example.KafkaExample.model.StudentEvents;
import com.example.KafkaExample.stream.StudentStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CourseListener {
    @Autowired




    CourseService courseService;
    @StreamListener(StudentStream.INPUT)
    public void  handleGreeting( @Payload  StudentEvents studentEvents) throws InterruptedException {
       log.info("events {}",studentEvents);
        courseService.receiveObjectDetails(studentEvents);

    }
}
