package com.jb.advanced_spring.service;

import com.jb.advanced_spring.beans.Student;
import com.jb.advanced_spring.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo studentRepo;

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public Student getStudentById(int id){
        return studentRepo.findById(id).get();
    }

    public void saveStudent(Student student){
        studentRepo.save(student);
    }
}
