package qihang03.threadsafe.exer;

public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account();

        Customer c1 = new Customer("甲", acct );
        Customer c2 = new Customer("乙", acct );
        c1.start();
        c2.start();
    }
}
class Account{
    private double balance;
    public synchronized void deposit(double amt) throws RuntimeException{
        if(amt > 0){
            balance += amt;
        }else{
            throw new RuntimeException("存入不能为非正数");
        }
        System.out.println(Thread.currentThread().getName() + "存钱1000块，余额为：" + balance);

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
class Customer extends Thread{
    Account account;

    public Customer(Account account) {
        this.account = account;
    }

    public Customer(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try{
                account.deposit(1000);
            }catch (RuntimeException e){
                e.printStackTrace();
            }
        }
    }
}