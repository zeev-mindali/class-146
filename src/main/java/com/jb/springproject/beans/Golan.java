package com.jb.springproject.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@Qualifier("golan")
public class Golan implements Teachable{
    @Override
    public void info() {
        System.out.println("הכל נפתר בעזרת השטר");
    }
}
