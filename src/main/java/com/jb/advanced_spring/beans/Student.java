package com.jb.advanced_spring.beans;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Date;


@AllArgsConstructor
@NoArgsConstructor
//@Component
@Entity
@Builder
@Getter
@Setter
@Table(name = "my_students")
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
    private int id;
    @Column(length = 40, nullable = false)
    private String name;
    private Date created;
    private boolean isMarried;
    private int age;
    private double grade;
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
