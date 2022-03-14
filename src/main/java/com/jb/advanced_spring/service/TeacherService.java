package com.jb.advanced_spring.service;

import com.jb.advanced_spring.beans.Teacher;
import com.jb.advanced_spring.exception.TeacherException;
import com.jb.advanced_spring.repository.TeacherRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepo teacherRepo;

    //create
    public void addTeacher(Teacher teacher){
        teacherRepo.save(teacher);
    }

    //read
    public Teacher getTeacher(int id) throws TeacherException {
        if (teacherRepo.existsById(id)){
            return teacherRepo.findById(id).get();
        } else {
            throw new TeacherException("Teacher not found");
        }
    }
    //update
    public void updateTeacher(Teacher teacher) throws TeacherException {
        if (teacherRepo.existsById(teacher.getId())){
            teacherRepo.save(teacher);
        } else {
            throw new TeacherException("Teacher not found");
        }
    }

    //delete
    public void deleteTeacher(int id) throws TeacherException {
        if (teacherRepo.existsById(id)){
            teacherRepo.deleteById(id);
        } else {
            throw new TeacherException("Teacher not found");
        }

    }

    public List<Teacher> getAllTeachers(){
        return teacherRepo.findAll();
    }
}
