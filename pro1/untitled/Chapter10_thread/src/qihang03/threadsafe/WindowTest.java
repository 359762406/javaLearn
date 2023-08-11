package qihang03.threadsafe;

/**
 * 必须保证一个线程a在操作ticket的过程中，其它线程必须等待，
 * 直到线程a操作ticket结束以后，
 * 其它线程才可以进继续操作ticket
 *  Java是如何解决线程的安全问题的?
 *      使用线程的同步机制。
 *方式1。同步代码块
 * synchronized(同步监视器){
 * //需要被同步的代码
 * }
 * 说明。
 * 需要被同步的代码，即为操作共享数据的代码。
 * 共享数据。即多个线程多需要操作的数据。比如。ticket
 * 需要被同步的代码，在被synchronized包裹以后，就使得一个线程在操作这些代码的过程中，
 *     其它线程必须等待。
 * 同步监视器，俗称锁。哪个线程获取了锁，哪个线程就能执行需要被同步的代码。
 * 同步监视器，可以使用任何一个类的对象充当。但是，多个钱程必须共用同一个同步监视器
 * 注意：在实现Runnable接口的方式中，同步监视器可以考虑使用。this。
 *      在继承Thread类的方式中，同步监视器要慎用this。
 *
 * 方法2：同步方法
 * 说明：
 * 如果操作共享数据的代码完整的声明在了一个方法中，那么我们就可以将此方法声明为同步方法即可。
 * > 非静态的同步方法，默认同步监视器是this
 * > 静态的同步方法，默认同步监视器是当前类本身。
 *
 * synchronized 解决线程安全问题
 * 弊端：在操作共享数据时，多线程其实是串行执行的，意味着性能低。
 */
public class WindowTest {
    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket(100);
        Thread t1 = new Thread(saleTicket);
        Thread t2 = new Thread(saleTicket);
        Thread t3 = new Thread(saleTicket);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class SaleTicket implements Runnable{
    private int ticket;
    private boolean isFlag = true;
    public SaleTicket(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while(this.isFlag){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            synchronized(this){ // this 是唯一的在Runnable对象实例
                this.show();
//            }

        }
    }
    /*
    同步方法， 此时的同步监视器是this,此题目是唯一的
     */
    public synchronized void show(){
        if (ticket > 0){
            System.out.println(Thread.currentThread().getName() + "售出" +
                    "票号为" + this.ticket);
            ticket --;
        }else{
            this.isFlag = false;
        }
    }
}