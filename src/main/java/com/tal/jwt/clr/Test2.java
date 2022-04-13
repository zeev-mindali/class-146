package com.tal.jwt.clr;

import com.tal.jwt.beans.Credentials;
import com.tal.jwt.services.LoginService;
import com.tal.jwt.util.DataEnc;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
@RequiredArgsConstructor
public class Test2 implements CommandLineRunner {
    private final LoginService loginService;

    @Override
    public void run(String... args) throws Exception {
//        Credentials user1 = Credentials.builder()
//                .userEmail("mindalizeev@gmail.com")
//                .userName("Zeev Mindali")
//                .userPass("12345678")
//                .build();

        String userName="Zeev Mindali";
        String userPass="12345678";

        String result = loginService.login(userName,userPass);
        System.out.println(result);

    }
}
