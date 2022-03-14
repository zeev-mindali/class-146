package com.jb.advanced_spring.clr;

import com.jb.advanced_spring.beans.Teacher;
import com.jb.advanced_spring.repository.TeacherRepo;
import com.jb.advanced_spring.util.TablePrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(4)
//@Component
@RequiredArgsConstructor
public class Test4 implements CommandLineRunner {
    private final TeacherRepo teacherRepo;
    @Override
    public void run(String... args) throws Exception {
        //read
        Teacher zeev = teacherRepo.getById(1);
        TablePrinter.print(zeev);

        //delete
        //teacherRepo.delete(zeev);
    }
}
