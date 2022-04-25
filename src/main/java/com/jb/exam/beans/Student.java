package com.jb.exam.beans;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @Column(name = "student_id")
    private long id;
    @Column(name = "student_class")
    private int studentClass;
    @Column(name = "student_grades")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Grade> studentGrade;

    public Student() {}

    public Student(long id, int studentClass, List<Grade> studentGrade) {
        this.id = id;
        this.studentClass = studentClass;
        this.studentGrade = studentGrade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public List<Grade> getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(List<Grade> studentGrade) {
        this.studentGrade = studentGrade;
    }
}
