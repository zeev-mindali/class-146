package com.jb.springproject.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@Primary
public class Zeev implements Teachable {

    @Override
    public void info() {
        System.out.println("Hello my brother from another mother.");
    }
}
