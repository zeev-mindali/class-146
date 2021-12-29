package oop.myClass;

public class BankTester {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.login("admin","zeev"));

        //System.out.println(bank.givePassword());
    }
}
