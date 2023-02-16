package com.studenten.studentenapp.repository;

import com.studenten.studentenapp.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository <Student,Long>{
}
