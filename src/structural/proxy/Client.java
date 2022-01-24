package structural.proxy;

public class Client {
    public static void main(String[] args) {
        AccountData proxyAccount=new ATMProxy();
        System.out.println("Account Type : "+proxyAccount.getAccountType());
        System.out.println("Balance in Account : "+proxyAccount.getAccountBalance());
        //proxyAccount.setAccountBalance(1000.0);

    }
}
