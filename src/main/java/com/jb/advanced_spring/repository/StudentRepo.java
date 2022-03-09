package com.jb.advanced_spring.repository;

import com.jb.advanced_spring.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//crud - 50% - sql update delete create
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
