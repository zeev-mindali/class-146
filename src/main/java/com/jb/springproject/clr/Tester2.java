package com.jb.springproject.clr;

import com.jb.springproject.data.Student;
import com.jb.springproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Tester2 implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        Student zeev = Student.builder()
//                .name("zeev")
//                .age(48)
//                .phone("052-404-3142")
//                .course(822)
//                .userClass(146)
//                .grade(80)
//                .address("Qiryat yam rabati")
//                .build();
//        studentRepository.save(zeev);
//        System.out.println("Save the data");

//        studentRepository.deleteById(3);
//        List<Student> students = studentRepository.findAll();
//        students.forEach(System.out::println);

        Optional<Student> student = studentRepository.findById(1);
        if (student.isEmpty()){
            System.out.println("no student found");
        } else {
            System.out.println(student);
        };
    }
}
