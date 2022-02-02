package bank_solution.beans;

public class VipClient extends Client{
    private static final float MY_INTEREST_RATE = 0.1f;
    public VipClient(double age, float interestRate, Account account) {
        super(age, MY_INTEREST_RATE, account);
    }

    public VipClient(String name, double age, float interestRate, Account account) {
        super(name, age, MY_INTEREST_RATE, account);
    }

    public VipClient(){
        super((int)(Math.random()*104)+16,MY_INTEREST_RATE,new Account(0.0));
    }
}
