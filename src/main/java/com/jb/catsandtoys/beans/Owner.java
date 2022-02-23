package com.jb.catsandtoys.beans;

import com.jb.catsandtoys.aop.DoNotTouchName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Scope("prototype")
@Builder
public class Owner {
    private String id = UUID.randomUUID().toString();
    private String name;
    private String address;
    private List<Cat> cats;

    @DoNotTouchName
    public void setId() {}
}
