package com.jb.springproject.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="class146")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 40)
    private String name;
    @Column(nullable = false,length = 40)
    private String address;
    @Column(nullable = false)
    private int age;
    private int grade;
    private int userClass;
    private int course;
    @Column(nullable = false,length = 40)
    private String phone;



}
