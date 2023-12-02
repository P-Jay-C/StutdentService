package com.pjay.StudentService.Repository;

import java.util.List;

import org.junit.jupiter.api.Disabled;
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
    @Disabled
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
    @Disabled
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();

        System.out.println("StudentList = "+ studentList);
    }

    @Test
    @Disabled
    public void printStudentByFirstName(){
        List<Student> student = studentRepository.findByFirstName("Jerry");

        System.out.println("Student: " + student);
    }

    @Test
    @Disabled
    public void printStudentByFirstNameContains(){
        List<Student> student = studentRepository.findByFirstNameContaining("Je");

        System.out.println("Student: " + student);
    }

    @Test
    @Disabled 
    public void getStudentByEmailAddress(){
        Student student = studentRepository.getStudentByEmailAddress("jerry@gmail.com");

        System.out.println("Student : " + student);
    }

    @Test
    public void updateNamebyEmail(){
        studentRepository.updateNamebyEmail("Yaw","jerry@gmail.com");

        printAllStudent();
    }

}  

