package com.jb.catsandtoys.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
@Builder
public class Cat {
    private String name;
    private int age;
    private String color;
    private int weight;
    private String favoriteFood;
    private boolean isMale;
    @Autowired
    private List<Toy> toys;

    public void addToy(Toy toy){
        toys.add(toy);
    }
}
