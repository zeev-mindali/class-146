package com.jb.springproject.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@Scope("prototype")  //so it will not be singleton
public class MyProtoType {
    private int x = (int)(Math.random()*101);
    //ApplicationContext ctx
}
