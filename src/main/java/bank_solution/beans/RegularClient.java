package bank_solution.beans;

public class RegularClient extends Client{
    private static final float MY_INTEREST_RATE = 0.05f;

    public RegularClient(double age, Account account) {
        super(age, MY_INTEREST_RATE, account);
    }

    public RegularClient(String name, double age, Account account) {
        super(name, age, MY_INTEREST_RATE, account);
    }

    public RegularClient(){
        super((int)(Math.random()*104)+16,MY_INTEREST_RATE,new Account(0.0));
    }

    /*
    public RegularClient(double age, Account account) {
        super(age, 5, account);
    }

    public RegularClient(String name, double age, Account account) {
        super(name, age, 5, account);
    }

     */
}
