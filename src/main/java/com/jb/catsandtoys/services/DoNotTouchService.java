package com.jb.catsandtoys.services;

import com.jb.catsandtoys.util.Art;
import org.springframework.stereotype.Service;

@Service
public class DoNotTouchService {
    public void sendMessage(){
        System.out.println(Art.dont);
    }
}
