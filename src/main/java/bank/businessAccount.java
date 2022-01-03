package bank;

public class businessAccount extends Account{
    public businessAccount(String accountNumber, String accountOwner) {
        super(accountNumber, accountOwner, 40_000, 3, true);
    }
}
