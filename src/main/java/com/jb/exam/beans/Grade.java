package com.jb.exam.beans;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "exam_date")
    private Date examDate;
    @Column(name = "exam_name")
    private String examName;
    @Column(name = "exam_grade")
    private short grade;

    public Grade() {}

    public Grade(long id, Date examDate, String examName, short grade) {
        this.id = id;
        this.examDate = examDate;
        this.examName = examName;
        this.grade = grade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        //
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public short getGrade() {
        return grade;
    }

    public void setGrade(short grade) {
        this.grade = grade;
    }
}
