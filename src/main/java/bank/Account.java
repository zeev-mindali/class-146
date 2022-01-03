package bank;

public class Account {
    protected String accountNumber;
    protected String accountOwner;
    protected int creditLimit;
    protected int commision;
    protected double loan;
    protected double balance;
    protected boolean canLoan;

    public Account(String accountNumber, String accountOwner, int creditLimit, int commision, boolean canLoan) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.creditLimit = creditLimit;
        this.commision = commision;
        this.canLoan = canLoan;
    }

    public void deposit(int amount){
        this.balance += amount*(1-this.commision/100.0);
    }

    public boolean withdraw(int amount){
        double withdrawAmount = amount*(1+this.commision/100.0);
        if (this.balance-withdrawAmount>creditLimit){
            this.balance-=withdrawAmount;
            return true;
        }
        return false;
    }

    public boolean takeLoan(int amount){
        if (this.canLoan){
            double totalLoan = creditLimit*(1+this.commision/100.0);
            if (this.balance-totalLoan>this.creditLimit){
                this.loan = totalLoan;
                deposit(amount);
                return true;
            } else {
                System.out.println("not sufficient funds");
                return false;
            }
        } else {
            System.out.println("not eligible to take a loan");
        }
        return false;
    }

    public boolean returnLoan(int amount){
        withdraw(amount);
        this.loan-=amount*(1-this.commision/100.0);
        return true;
    }

    public boolean setCommission(int amount){
        if (this instanceof soldierAccount || this instanceof youngAccount){
            System.out.println("you can not change commission rate");
            return false;
        }
        this.commision=amount;
        return true;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCanLoan(boolean canLoan) {
        this.canLoan = canLoan;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getCommision() {
        return commision;
    }

    public double getLoan() {
        return loan;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isCanLoan() {
        return canLoan;
    }
}
