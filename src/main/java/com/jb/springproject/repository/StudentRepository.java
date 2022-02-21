package com.jb.springproject.repository;

import com.jb.springproject.data.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByAgeLessThan(int age);
    List<Student> findByAgeGreaterThan(int age);
}
