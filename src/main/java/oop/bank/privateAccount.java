package oop.bank;

public class privateAccount extends Account implements Loanable{
    public privateAccount(String accountNumber, String accountOwner) {
        super(accountNumber, accountOwner, 10_000, 5);
    }

    @Override
    public boolean issueCreditCard() {
        System.out.println("Issued private credit card");
        return true;
    }
}
