package com.jb.advanced_spring.beans;

import lombok.*;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 40)
    private String name;
    private String phoneNumber;
    @Singular("student")
    @OneToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "pink_brain", joinColumns = @JoinColumn(name = "student_id")
//            ,inverseJoinColumns = @JoinColumn(name = "id"))
    //@JoinColumn(name = "student_id")
    private List<Student> studentList;
}
