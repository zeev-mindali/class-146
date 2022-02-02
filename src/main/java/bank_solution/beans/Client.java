package bank_solution.beans;

public abstract class Client extends Person{
    //attributes
    protected float interestRate;
    protected Account account;

    //constructors
    public Client(double age, float interestRate, Account account) {
        super(age);
        this.interestRate=interestRate;
        this.account=account;
    }

    public Client(String name, double age, float interestRate, Account account) {
        super(name, age);
        this.interestRate=interestRate;
        this.account=account;
    }

    public Client(){
        super((int)(Math.random()*104)+16);
    }

    //methods

    public float getInterestRate() {
        return interestRate;
    }

    protected void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public Account getAccount() {
        return account;
    }

    protected void setAccount(Account account) {
        this.account = account;
    }



}
