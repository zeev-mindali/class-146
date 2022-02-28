package com.jb.catsandtoys.shriker;

import java.util.List;

public class Company {
    private int id;
    private String name;
    private String email;
    private String password;
    List<String> coupons;

    public Company(){}

    public Company(int id, String name, String email, String password, List<String> coupons) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.coupons = coupons;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) throws MethodNotAllowedException {
       throw new MethodNotAllowedException("You can not change comapny id");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws MethodNotAllowedException {
        throw new MethodNotAllowedException("You can not change comapny name");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<String> coupons) {
        this.coupons = coupons;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", coupons=" + coupons +
                '}';
    }
}
