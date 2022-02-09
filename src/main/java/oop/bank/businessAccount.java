package oop.bank;

public class businessAccount extends Account implements Loanable{
    public businessAccount(String accountNumber, String accountOwner) {
        super(accountNumber, accountOwner, 40_000, 3);
    }

    @Override
    public boolean issueCreditCard() {
        System.out.println("Issued platinum credit card");
        return true;
    }
}
