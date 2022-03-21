package com.jb.advanced_spring.controller;

import com.jb.advanced_spring.beans.Student;
import com.jb.advanced_spring.beans.UserDetails;
import com.jb.advanced_spring.beans.UserType;
import com.jb.advanced_spring.exception.LoginException;
import com.jb.advanced_spring.exception.StudentException;
import com.jb.advanced_spring.exception.TokenException;
import com.jb.advanced_spring.secuirty.JWTutil;
import com.jb.advanced_spring.service.StudentService;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.security.SignatureException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")   //http://localhost:8080/student
@RequiredArgsConstructor
public class StudentController {
    private final JWTutil jwtUtil;
    private final StudentService studentService;

    @GetMapping("/all") //  http://localhost:8080/student/all
    public ResponseEntity<?> getAllStudents(@RequestHeader(name = "Authorization") String token) throws LoginException {
        if (!jwtUtil.checkUser(token,UserType.ADMIN)) throw new LoginException("Invalid Token");
        return ResponseEntity.ok()
                .header("Authorization", jwtUtil.generateToken(token.replace("Bearer ", "")))
                .body(studentService.getAllStudents());
    }

    @GetMapping("/student/{id}")    //http://localhost:8080/student/2
    public ResponseEntity<?> getStudentById(@PathVariable int id) {
        System.out.println("Sending single student to the user");
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.ACCEPTED);
    }

    @PostMapping("/add")
    public ResponseEntity<?> saveNewStudent(@RequestBody Student student) {
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
