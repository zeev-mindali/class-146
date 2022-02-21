package com.jb.springproject.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component          //THIS CLASS WILL BE PART OF SPRING FRAME WORK WITH ALL THE PEOPLE :)
@Data               //to string, hash, equal , getters , setters
@NoArgsConstructor  //default c'tor
public class MySingleTon {
    private int x = (int)(Math.random()*101);
}
