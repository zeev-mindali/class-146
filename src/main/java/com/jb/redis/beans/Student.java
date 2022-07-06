package com.jb.redis.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder //for tal the kartzya
public class Student implements Serializable {
    public enum Gender {MALE,FEMALE,OTHER} //for tal bechor :)
    public String id;
    public String name;
    public Gender gender;
    private int grade;
}
