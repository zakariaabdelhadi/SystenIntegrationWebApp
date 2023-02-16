package com.studenten.studentenapp.service;

import com.studenten.studentenapp.entities.Student;

import java.util.List;

public interface StudentService {

    List<Student>  getAll();

   Student  saveStudent(Student student);

   void deleteStudent(Long id);


}
