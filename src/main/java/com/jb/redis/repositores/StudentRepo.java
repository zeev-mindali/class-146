package com.jb.redis.repositores;

import com.jb.redis.beans.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student,String> {
}
