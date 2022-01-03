package bank;

public class privateAccount extends Account{
    public privateAccount(String accountNumber, String accountOwner) {
        super(accountNumber, accountOwner, 10_000, 5, true);
    }
}
