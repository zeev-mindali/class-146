package com.jb.exam.controllers;

import com.jb.exam.beans.Student;
import com.jb.exam.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    //crud
    //create
    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    //update
    @PutMapping("/update")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void updateStudent(@RequestBody Student student) throws Exception {
        studentService.updateStudent(student);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteStudent(@PathVariable long id){
        studentService.deleteStudent(id);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable long id) throws Exception {
        return new ResponseEntity<>(studentService.readStudentById(id),HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllStudent() throws Exception {
        return new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.OK);
    }

    @GetMapping("/avg")
    public ResponseEntity<?> getAvg(){
        return new ResponseEntity<>(studentService.getAllStudentAvg(),HttpStatus.OK);
    }

    @GetMapping("/avgById/{id}")
    public ResponseEntity<?> getAvgById(@PathVariable long id){
        return new ResponseEntity<>(studentService.getStudentAvg(id),HttpStatus.OK);
    }

}
