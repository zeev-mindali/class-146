package com.jb.advanced_spring.controller;

import com.jb.advanced_spring.beans.Student;
import com.jb.advanced_spring.exception.StudentException;
import com.jb.advanced_spring.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")   //http://localhost:8080/student
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/all") //  http://localhost:8080/all
    public ResponseEntity<?> getAllStudents(){
        System.out.println("Sending all students to user");
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")    //http://localhost:8080/student/2
    public ResponseEntity<?> getStudentById(@PathVariable int id){
        System.out.println("Sending single student to the user");
        return new ResponseEntity<>(studentService.getStudentById(id),HttpStatus.ACCEPTED);
    }

    @PostMapping("/add")
    public ResponseEntity<?> saveNewStudent(@RequestBody Student student){
        System.out.println("Savind new student");
        studentService.saveStudent(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/update")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void updateStudent(@RequestBody Student student) throws StudentException {
        studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void deleteStudent(@PathVariable int id) throws StudentException {
        studentService.deleteStudent(id);
    }

}
