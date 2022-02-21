package com.jb.springproject.beans;

import com.jb.springproject.SpringprojectApplication;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Cat {
    //todo: change to Application context
    private String catName = new CatNames().getCatName();

    private int catAge = (int)(Math.random()*10)+7;

    @Autowired
    private Chip chip;

}
