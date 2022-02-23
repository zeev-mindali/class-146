package com.jb.catsandtoys.aop;

import com.jb.catsandtoys.services.DoNotTouchService;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
public class DontTouchAspect {

    final DoNotTouchService doNotTouchService;

    @After("@annotation(DoNotTouchName)")
    public void sendMessage() {
        doNotTouchService.sendMessage();
    }
}
