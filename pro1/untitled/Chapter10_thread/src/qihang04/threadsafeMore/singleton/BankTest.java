package qihang04.threadsafeMore.singleton;

public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
    }
}
class Bank{
    private Bank(){};

    private static Bank instance = null;

    public static synchronized Bank getInstance(){  //同步监视器为当前类本身 默认为Bank.class
        if (instance == null){
            instance = new Bank();
        }
        return instance;
    }
}
