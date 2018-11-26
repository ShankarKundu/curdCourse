package com.example.KafkaExample.service;

import com.example.KafkaExample.Repositary.CourseRepositary;
import com.example.KafkaExample.model.Course;
import com.example.KafkaExample.model.StudentEvents;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CourseService {

    @Autowired
    CourseRepositary courseRepositary;
     int i=0;




    public void receiveObjectDetails(StudentEvents studentEvents) {

            if (studentEvents.getStatus().toString().equals("CREATE")) {
                Course course = new Course();
                course.setNoOfStudentEnrolled(i++);
                //int y = 10 / 0;
                courseRepositary.save(course);
                log.info("store {}", course);



    }

}}
