package com.jb.exam.services;

import com.jb.exam.beans.Grade;
import com.jb.exam.beans.Student;
import com.jb.exam.repositories.GradeRepo;
import com.jb.exam.repositories.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo studentRepo;
    private final GradeRepo studentGrades;
    //crud
    public void addStudent(Student student){
        studentRepo.save(student);
    }

    public void updateStudent(Student student) throws Exception {
        if (studentRepo.existsById(student.getId())) {
            studentRepo.save(student);
        } else {
            throw new Exception("student does not exists");
        }
    }

    public void deleteStudent(long id){
        studentRepo.deleteById(id);
    }

    public Student readStudentById(long id) throws Exception {
        Optional<Student> student = studentRepo.findById(id);
        if (student.isPresent()){
            return student.get();
        } else {
            throw new Exception("Student not found");
        }
    }

    public List<Student> getAllStudents() throws Exception {
        if (studentRepo.findAll().isEmpty()){
            throw new Exception("NO DATA !!!!");
        }
        return studentRepo.findAll();
    }

    public double getAllStudentAvg(){
        List<Grade> grade = studentGrades.findAll();
        return grade.stream().mapToDouble(Grade::getGrade).average().orElse(0);
    }

    public double getStudentAvg(long id){
        List<Grade> grade = studentRepo.getById(id).getStudentGrade();
        return grade.stream().mapToDouble(Grade::getGrade).average().orElse(0);
    }
}
