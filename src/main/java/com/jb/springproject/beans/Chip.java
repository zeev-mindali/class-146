package com.jb.springproject.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Data
@NoArgsConstructor
public class Chip {
    private String chipId = UUID.randomUUID().toString();

    public Chip(String chipId) {
        this.chipId = chipId;
    }
}
