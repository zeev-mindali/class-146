package com.jb.redis.clr;

import com.jb.redis.beans.Student;
import com.jb.redis.repositores.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class test implements CommandLineRunner {
    @Autowired
    public StudentRepo studentRepo;
    @Override
    public void run(String... args) throws Exception {
        //saving student
        //Student student = new Student("Fulllstack JAVA", "Lea Sadikov",Student.Gender.OTHER,90);
        //studentRepo.save(student);
        //System.out.println("Student was save");

        //getting student
        Student getStudent = studentRepo.findById("Fulllstack JAVA").get();
        System.out.println(getStudent);
//        getStudent.setName("Lea kiril");
//        studentRepo.save(getStudent);


    }
}
