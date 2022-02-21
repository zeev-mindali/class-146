package com.jb.springproject.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class CatNames {
    private final String[] catNames = {"Bumper","Pagasho", "Luna","Mitzi", "Kitzi","Pitzi"};
    private int catNum = (int)(Math.random()*catNames.length);
    private String catName = catNames[catNum];
}
