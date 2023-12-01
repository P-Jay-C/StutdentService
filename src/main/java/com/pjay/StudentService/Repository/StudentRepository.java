package com.pjay.StudentService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pjay.StudentService.Models.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    
}
