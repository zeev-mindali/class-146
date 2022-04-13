package com.tal.jwt.clr;

import com.tal.jwt.beans.Address;
import com.tal.jwt.repositories.AddressRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
@RequiredArgsConstructor
public class InitAddress implements CommandLineRunner {
    private final AddressRepo addressRepo;

    @Override
    public void run(String... args) throws Exception {
        Address add1 = Address.builder().address("Qiryat Yam").build();
        Address add2 = Address.builder().address("Tel Aviv").build();
        Address add3 = Address.builder().address("Ramat Gan").build();
        Address add4 = Address.builder().address("Karnei Shomron").build();
        Address add5 = Address.builder().address("Rishon Le Zion").build();

        addressRepo.saveAll(List.of(add1,add2,add3,add4,add5));
    }
}
