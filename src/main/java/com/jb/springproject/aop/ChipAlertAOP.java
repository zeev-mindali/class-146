package com.jb.springproject.aop;

import com.jb.springproject.service.ChipService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ChipAlertAOP {
    @Autowired
    ChipService chipService;

    @After("@annotation(ChipAlert)")
    public void sendAlert(){
        chipService.showAlert();
    }
}
