package bank;

public class soldierAccount extends Account{

    public soldierAccount(String accountNumber, String accountOwner) {
        super(accountNumber, accountOwner, 1_000, 1, false);
    }
}
