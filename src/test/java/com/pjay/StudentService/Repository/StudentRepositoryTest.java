package com.pjay.StudentService.Repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pjay.StudentService.Models.Guardian;
import com.pjay.StudentService.Models.Student;



@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){

        Guardian guardian = Guardian.builder()
                    .email("boat@gmail.com")
                    .name("boat")
                    .mobile("024444444")
                    .build();

        Student student = Student.builder()
                            .emailId("jerry@gmail.com")
                            .firstName("jerry")
                            .lastName("justice")
                            .guardian(guardian)
                            .build();

        studentRepository.save(student);
    }


    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();

        System.out.println("StudentList = "+ studentList);
    }
}  

