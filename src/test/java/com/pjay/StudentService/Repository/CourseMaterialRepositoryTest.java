package com.pjay.StudentService.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pjay.StudentService.Models.Course;
import com.pjay.StudentService.Models.CourseMaterial;

@SpringBootTest
public class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial(){

        Course course = Course.builder()
        .title("Java")
        .credit(5)
        .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
        .url("www.google.com")
        .course(course)
        .build();

        courseMaterialRepository.save(courseMaterial);   
    }
}
