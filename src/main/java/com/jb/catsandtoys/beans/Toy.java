package com.jb.catsandtoys.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Scope("prototype")
public class Toy {
    //i not your toy.....
    private String toyName;
    private String color;
    private boolean hasSound;
}
