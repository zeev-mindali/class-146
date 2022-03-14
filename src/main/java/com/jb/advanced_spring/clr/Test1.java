package com.jb.advanced_spring.clr;

import com.jb.advanced_spring.beans.Gender;
import com.jb.advanced_spring.beans.Student;
import com.jb.advanced_spring.beans.Teacher;
import com.jb.advanced_spring.repository.StudentRepo;
import com.jb.advanced_spring.repository.TeacherRepo;
import com.jb.advanced_spring.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;

//@Component
@Order(1)
@RequiredArgsConstructor
public class Test1 implements CommandLineRunner {
    private final ApplicationContext ctx;
    private final StudentRepo studentRepo;
    private final TeacherRepo teacherRepo;
    private final StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
        Student golan = Student.builder()
                .name("Golan")
                .age(30)
                .created(new Date(System.currentTimeMillis()))
                .isMarried(true)
                .grade(95)
                .gender(Gender.MALE)
                .build();

        Student tal = Student.builder()
                .name("Tal")
                .age(22)
                .created(new Date(System.currentTimeMillis()))
                .isMarried(false)
                .grade(100)
                .gender(Gender.FEMALE)
                .build();

        Student Lea = Student.builder()
                .name("Lea")
                .age(21)
                .created(new Date(System.currentTimeMillis()))
                .isMarried(true)
                .grade(92)
                .gender(Gender.FEMALE)
                .build();

        Student Oren = Student.builder()
                .name("Oren")
                .age(21)
                .created(new Date(System.currentTimeMillis()))
                .isMarried(false)
                .grade(98)
                .gender(Gender.MALE)
                .build();

        Student Omer = Student.builder()
                .name("Omer Cohen")
                .age(28)
                .created(new Date(System.currentTimeMillis()))
                .isMarried(false)
                .grade(96)
                .gender(Gender.OTHER)
                .build();

        List<Student> studentList = List.of(golan, tal, Omer, Oren, Lea);
        System.out.println("Saving students");
        studentRepo.saveAll(studentList);

//        Teacher zeev = Teacher.builder()
//                .name("zeevik the fox")
//                .phoneNumber("052-404-3142")
//                .studentList(studentList)
//                .build();
//
//
//
//
//        Teacher teacherTal = Teacher.builder()
//                .name("Tal Bechor")
//                .phoneNumber("055-555-5555")
//                .studentList(List.of(Oren,Lea))
//                .build();


        //teacherRepo.save(teacherTal);


//        teacherRepo.save(zeev);
        //teacherRepo.saveAll(List.of(zeev));
        //CREATE


        //CREATE
        //studentRepo.saveAll(List.of(golan,tal,Oren,Omer,Lea));
//        System.out.println("===================================");
//        System.out.println("All students in the system");
//        studentService.getAllStudents().forEach(System.out::println);
//
//        System.out.println(studentService.getStudentById(2));
    }
}
