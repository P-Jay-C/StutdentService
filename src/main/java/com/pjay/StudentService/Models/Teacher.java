package com.pjay.StudentService.Models;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {
    
    @Id
    @SequenceGenerator(
        allocationSize = 1,
        name = "teacher_sequence",
        sequenceName = "teacher_seuence"

    )

    @GeneratedValue(
        generator = "teacher_sequence",
        strategy = GenerationType.SEQUENCE
    )
    private Long teacherId;
    private String firstName;
    private String lastName;

    @JoinColumn(
        name = "teacher_id",
        referencedColumnName = "teacherId"
    )
    private List<Course> courses;
}
