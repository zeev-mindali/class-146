package com.jb.springproject.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class Phone {
    private String phoneNumber="052-404-3142";
}
