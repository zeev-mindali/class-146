package com.jb.springproject.threads;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
@EnableAsync    //for enabling async task
@EnableScheduling
public class Penny {

    @Async
    @Scheduled(fixedRate = 2000)
    public void sheldon(){
        System.out.println("Knock Knock !!! Penny !!!!");
    }

    @Async
    //@Scheduled(fixedRate = 1000*60*60*24)
    //0->sec 30->minutes 1->hours , 15->day , *->month , ?->time zone
    @Scheduled(cron = "0 30 1 15 * ?",zone = "Asia/Jerusalem")
    public void deleteOldCoupon(){
        System.out.println("Deleting coupons...... (SQL)");
    }
}
