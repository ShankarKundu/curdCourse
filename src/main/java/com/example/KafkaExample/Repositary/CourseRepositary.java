package com.example.KafkaExample.Repositary;

import com.example.KafkaExample.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepositary extends JpaRepository<Course,Long> {
}
