package com.jb.advanced_spring.clr;

import com.jb.advanced_spring.beans.Student;
import com.jb.advanced_spring.repository.StudentRepo;
import com.jb.advanced_spring.util.TablePrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

//@Component
@Order(2)
@RequiredArgsConstructor
public class Test2 implements CommandLineRunner {
    private final StudentRepo studentRepo;

    @Override
    public void run(String... args) throws Exception {
        //read - single object
        /*
            Student oren = studentRepo.getById(30);
            TablePrinter.print(oren);
        */
//        studentRepo.findById(3)
//                .ifPresentOrElse(TablePrinter::print, new Runnable() {
//                    @Override
//                    public void run() {
//                        System.out.println("Not found, shame on you !!!!");
//                    }
//                });

        Optional<Student> oren = studentRepo.findById(3);
        if (oren.isPresent()){
            TablePrinter.print(oren.get());
        } else {
            System.out.println("Student not found");
        }


        //read -> collection
        List<Student> students = studentRepo.findAll();
        TablePrinter.print(students);
    }
}
