package com.pjay.StudentService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pjay.StudentService.Models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
