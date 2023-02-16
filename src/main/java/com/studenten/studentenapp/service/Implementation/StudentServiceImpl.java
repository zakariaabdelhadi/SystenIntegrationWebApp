package com.studenten.studentenapp.service.Implementation;

import com.studenten.studentenapp.entities.Student;
import org.springframework.stereotype.Service;
import com.studenten.studentenapp.repository.StudentRepository;
import com.studenten.studentenapp.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAll() {

    return studentRepository.findAll();

    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
         studentRepository.deleteById(id);
    }
}
