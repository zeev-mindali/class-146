package com.jb.springproject.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@Scope("prototype")
public class Student {
    private int id;
    private String name;
    private String lName;
    private String add;

    @Value("${grade}")
    private int grade;
}
