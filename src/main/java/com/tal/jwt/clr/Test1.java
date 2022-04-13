package com.tal.jwt.clr;

import com.tal.jwt.beans.Credentials;
import com.tal.jwt.repositories.UserRepo;
import com.tal.jwt.util.DataEnc;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
@RequiredArgsConstructor
public class Test1 implements CommandLineRunner {

    private final UserRepo userRepo;

    @Override
    public void run(String... args) throws Exception {
        Credentials user1 = Credentials.builder()
                .userEmail("mindalizeev@gmail.com")
                .userName("Zeev Mindali")
                .userPass(DataEnc.setEncryptor("12345678"))
                .build();

        userRepo.save(user1);

        System.out.println("Me finished :)");

    }
}
