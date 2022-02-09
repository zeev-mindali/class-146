package oop.bank;

public class youngAccount extends Account{
    public youngAccount(String accountNumber, String accountOwner) {
        super(accountNumber, accountOwner, 0, 0);
    }

    @Override
    public boolean issueCreditCard() {
        System.out.println("Issued debit credit card");
        return true;
    }
}
