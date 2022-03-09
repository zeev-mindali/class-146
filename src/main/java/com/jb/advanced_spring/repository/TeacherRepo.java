package com.jb.advanced_spring.repository;

import com.jb.advanced_spring.beans.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
}
