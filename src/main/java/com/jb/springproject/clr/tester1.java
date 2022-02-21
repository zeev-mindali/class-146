package com.jb.springproject.clr;

import com.jb.springproject.data.Student;
import com.jb.springproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class tester1 implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        Student student1 = Student.builder()
//                .name("Tal")
//                .address("RamatGan")
//                .age(22)
//                .course(822)
//                .userClass(146)
//                .grade(100)
//                .phone("052-467-3215")
//                .build();

        //studentRepository.save(student1);
        List<Student> allStudents = studentRepository.findByAgeLessThan(30);
        allStudents.forEach(System.out::println);

//        Student tal = studentRepository.findAll().get(1);
//        System.out.println(tal);
//        tal.setAddress("Ramat Gan (tchunim)");
//        studentRepository.save(tal);
        System.out.println("Me finished :)");
    }
}
