package com.jb.advanced_spring.clr;

import com.jb.advanced_spring.beans.Gender;
import com.jb.advanced_spring.beans.Student;
import com.jb.advanced_spring.repository.StudentRepo;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

//@Component
@Order(3)
@RequiredArgsConstructor
public class Test3 implements CommandLineRunner {
    private final StudentRepo studentRepo;

    @Override
    public void run(String... args) throws Exception {
        //UPDATE
//        Student omer = studentRepo.getById(4);
//        omer.setGender(Gender.MALE);
//        studentRepo.save(omer);
//

        studentRepo.findById(4).ifPresentOrElse(
                        student -> {
                            student.setGender(Gender.MALE);
                            studentRepo.save(student);
                        }, ()->System.out.println("WTF???"));

        //DELETE
        //studentRepo.deleteById(4);
        //Optional<Student> omer = studentRepo.findById(4);
        if (studentRepo.existsById(4)){
            studentRepo.deleteById(4);
        } else {
            System.out.println("Student not found :(");
        }
    }
}
