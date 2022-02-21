package com.jb.springproject.service;

import com.jb.springproject.util.Art;
import org.springframework.stereotype.Service;

@Service
public class ChipService {
    public void showAlert(){
        System.out.println(Art.chipChange);
    }
}
