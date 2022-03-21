package com.jb.advanced_spring.clr;

import com.jb.advanced_spring.beans.UserDetails;
import com.jb.advanced_spring.beans.UserType;
import com.jb.advanced_spring.repository.ClientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
@RequiredArgsConstructor
public class Test5 implements CommandLineRunner {
    private final ClientRepo clientRepo;

    @Override
    public void run(String... args) throws Exception {
        UserDetails tal = new UserDetails(0,"Tal@Hi.bye","12345", UserType.COMPANY);
        UserDetails roy = new UserDetails(0,"Roy@foff.com","54321",UserType.CUSTOMER);

        clientRepo.saveAll(List.of(tal,roy));
    }
}
