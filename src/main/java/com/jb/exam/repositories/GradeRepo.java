package com.jb.exam.repositories;

import com.jb.exam.beans.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepo extends JpaRepository<Grade,Long> {
}
