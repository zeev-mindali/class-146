package com.jb.advanced_spring.controller;

import com.jb.advanced_spring.beans.Teacher;
import com.jb.advanced_spring.exception.TeacherException;
import com.jb.advanced_spring.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherService teacherService;

    //create
    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addTeacher(@RequestBody Teacher teacher) {
        teacherService.addTeacher(teacher);
    }

    //read
    @GetMapping("/all")
    public ResponseEntity<?> getAllTeachers() {
        return new ResponseEntity<>(teacherService.getAllTeachers(), HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<?> getOneTeacher(@PathVariable int id) throws TeacherException {
        return new ResponseEntity<>(teacherService.getTeacher(id), HttpStatus.OK);
    }

    //update
    @PutMapping("/update")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void updateTeacher(@RequestBody Teacher teacher) throws TeacherException {
        teacherService.updateTeacher(teacher);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteTeacher(@PathVariable int id) throws TeacherException {
        teacherService.deleteTeacher(id);
    }

}
