package oop.bank;

public class soldierAccount extends Account implements Loanable{

    public soldierAccount(String accountNumber, String accountOwner) {
        super(accountNumber, accountOwner, 1_000, 1);
    }

    @Override
    public boolean issueCreditCard() {
        System.out.println("Issued chever credit card");
        return true;
    }
}
