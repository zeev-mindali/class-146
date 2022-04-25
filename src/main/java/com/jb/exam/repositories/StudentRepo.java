package com.jb.exam.repositories;

import com.jb.exam.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
