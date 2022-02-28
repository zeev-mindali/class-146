package com.jb.catsandtoys.shriker;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        //SELECT * FROM companies WHERE id=5
        Company company = new Company(5,"Saar and other people","saar@bmw.com","12345",new ArrayList<>());


        company.setEmail("saar@Rolls-Royce.com");
        //UPDATE companies SET name=?,email=?,password=?,coupons=? WHERE id=5


    }
}
