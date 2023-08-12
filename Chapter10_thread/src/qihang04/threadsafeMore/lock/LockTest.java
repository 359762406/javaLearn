package qihang04.threadsafeMore.lock;


import java.util.concurrent.locks.ReentrantLock;

/**
 *除了使用synchronized同步机制处理线程安全问题之外，还可以使用jdk5.0提供的Lock锁的方式
 * 1．步骤;
 * 步骤1．创建Lock的实例，需要确保多个线程共用同一个Lock实例!需要考虑将此对象声明为static final
 * 步骤2．执行lock()方法，锁定对共享资源的调用
 * 步骤3. unlock()的调用，释放对共享数据的锁定
 * 2．面试题。
 * synchronized同步的方式与Lock的对比?
 * synchronized不管是同步代码块还是同步方法，都需要在结束一对争之后，释放对同步监视器的调用。
 * Lock是通过两个方法控制需要被同步的代码，更灵活一些。
 * Lock作为接口,提供了多种实现类,适合更多更复杂的场景，效率更高。
 *
 *
 *
 */
public class LockTest {
    public static void main(String[] args) {

        Window.setTicket(100);
        Window.setObj(new Object());
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");
        w1.start();
        w2.start();
        w3.start();

    }
}
class Window extends Thread{
    private static int ticket;
    private static Object  obj;
    public static void setTicket(int number) {
        ticket = number;
    }
    public static void setObj(Object obj1) {
        obj = obj1;
    }
    private static boolean isFlag = true;
    //1.创建Lock的实例， 需要确保多个线程公用一个Lock实例，将其声明为static final
    private static final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while(this.isFlag){
            try{
                //2.锁定对共享资源的调用
                lock.lock();
//                try {
//                    Thread.sleep(5);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            synchronized (obj) {

                this.show();
            }finally {
                //3.释放对共享数据的锁定
                lock.unlock();

            }
        }

    }

    public void show(){ //此时同步监视器 this 不唯一  线程不安全
//        synchronized (Window.class) { // 结构：Class clz = Window.class 反射唯一的
        if (ticket > 0){
            System.out.println(Thread.currentThread().getName() + "售出" +
                    "票号为" + this.ticket);
            ticket --;
        }else{
            isFlag  = false;
        }
//        }

    }
    //利用static 此时的类本身为Window.class
    //
}