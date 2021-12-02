package singleton;

public class Hotstar {
    public static void main(String[] args) {
        HotstarAccount ram=HotstarAccount.getInstance();
        ram.streaming();
        System.out.println();
        HotstarAccount sham=HotstarAccount.getInstance();
        sham.streaming();
        System.out.println();
        HotstarAccount kumar=HotstarAccount.getInstance();
        kumar.streaming();
    }
}
