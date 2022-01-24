package structural.proxy;

public class BankAccount implements AccountData{
    private int accountNumber=1234;
    private double accountBalance=2000.0;
    private String accountType="savings";

    public BankAccount(){}

    public BankAccount(int accountNumber, double accountBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String getAccountType() {
        return accountType;
    }

    @Override
    public double getAccountBalance() {
        return accountBalance;
    }
}
