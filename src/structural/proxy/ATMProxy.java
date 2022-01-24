package structural.proxy;

public class ATMProxy implements  AccountData {

    @Override
    public String getAccountType() {
        BankAccount account=new BankAccount();
        return account.getAccountType();
    }

    @Override
    public double getAccountBalance() {
        BankAccount account=new BankAccount();
        return account.getAccountBalance();
    }
}
