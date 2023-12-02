package com.pjay.StudentService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pjay.StudentService.Models.CourseMaterial;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long>{
    
}
