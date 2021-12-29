package oop.myClass;

public class Bank {
    private String name="admin";
    private String password="12345";

    public boolean login(String userName, String userPassword){
        return (userName.equals(name) && userPassword.equals(password));
    }

    public void setPassword(String newPassword){
        password=newPassword;
    }

    public String getPassword(){
        return password;
    }
}
