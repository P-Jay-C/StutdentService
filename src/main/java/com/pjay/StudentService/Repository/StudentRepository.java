package com.pjay.StudentService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pjay.StudentService.Models.Student;

import jakarta.transaction.Transactional;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    

    List<Student> findByFirstName(String firstName);
    List<Student> findByFirstNameContaining(String name);

    @Query("select s from Student s where s.emailId  = ?1")
 
    Student getStudentByEmailAddress(String emaailId);

    @Modifying
    @Transactional
    @Query(
        value = "UPDATE tbl_student SET first_name = ?1 where email_address =?2",
        nativeQuery = true  )
    int updateNamebyEmail(String firstName, String emailId);
}
