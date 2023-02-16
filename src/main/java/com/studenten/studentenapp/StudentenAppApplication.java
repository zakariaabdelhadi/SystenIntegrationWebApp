package com.studenten.studentenapp;

import com.studenten.studentenapp.entities.Student;
import com.studenten.studentenapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class StudentenAppApplication implements CommandLineRunner {




    public static void main(String[] args) {
        SpringApplication.run(StudentenAppApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {

      //  Student student1 = new Student("Milissa","zermani","kouider@issani.com");
       // studentRepository.save(student1);
       // Student student2 = new Student("sofia","zermani","kouider@issani.com");
       // studentRepository.save(student2);

    }
}
