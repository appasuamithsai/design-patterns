package singleton;

public class HotstarAccount {
    private static HotstarAccount account=null;
    private HotstarAccount(){}
    static int userCount;
    public static HotstarAccount getInstance(){
        if(account==null)
            account = new HotstarAccount();                // Lazy evaluation
        userCount++;
        return account;
    }

    public void streaming(){
        if(userCount>1) System.out.println("Please Log out Of Other devices...");
        else System.out.println("Watching a movie ....");
    }

}
