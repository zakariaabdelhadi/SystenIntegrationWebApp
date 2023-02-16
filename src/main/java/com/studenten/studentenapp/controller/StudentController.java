package com.studenten.studentenapp.controller;

import com.studenten.studentenapp.entities.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.studenten.studentenapp.service.StudentService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model){

        model.addAttribute("students", studentService.getAll());
        return "students";

    }


    @GetMapping("/students/new")
    public String createStudentForm(Model model){

        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";

    }

    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student){

        studentService.saveStudent(student);
        return  "redirect:/students";


    }



    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){

        studentService.deleteStudent(id);

        return  "redirect:/students";


    }
}
