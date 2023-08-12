package qihang02.method_lifecycle;

/**
 *
 * 1.线程中的构造器
 * - public Thread0:分配一个新的线程对象。
 * - public Thread(String name):分配一个指定名字的新的线程对象。
 * - public Thread(Runnable target):指定创建线程的目标对象，它实现了Runnable接口中的run方法
 * - public Thread(Runnable target, String name):分配一个带有指定目标新的线程对象并指定名字。
 * 2.线程中的常用方法:
 * > start() : 启动线程②调用线程的run()
 * > run(): 将线程要执行的操作,声明在run()中。
 * > currentThread(): 获取当前执行代码对应的线程
 * > getName():获取线程名
 * > setName():设置线程名
 * > sleep(long millis): 静态方法,调用时,可以使得当前线程睡眠指定的豪秒数
 * > yield(): —旦执行此方法,就释放CPU的执行权
 * > join() 在线程a中通过线程b调用join()，意味着线程a进入阻塞状态，直到线程b执行结束，线程a才继续执行
 * > isAlive() 线程是否存货
 * 2．线程调度策略
 * 分时调度。所有线程`轮流使用’CPU 的使用权，并且平均分配每个线程占用CPU的时间。·
 * 抢占式调度。让`优先级高的线程以"较大的概率*优先使用CPU。如果线程的优先级相同，那么会随机选择一个(线程随机性),
 *
 *  getPriority():获取线程的优先级
 *  setPriority()∶设置线程的优先级。范围[1,10]
 * Thread类内部声明的三个常量:
 *  MAX_PRIORITY (10)。最高优先级
 *  MIN _PRIORITY (1)。最低优先级
 *  NORM_PRIORITY (5)。普通忧先级，默认情况下main线程具有普通优先级。
 *
 *
 */
public class ThreadConductor {
    public static void main(String[] args) {
        PrintEvenNumber t1 = new PrintEvenNumber("Thread - 1");
        t1.setName("子线程1");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() +  ":"+
                         Thread.currentThread().getPriority()+ ":" + i);
            }
//            if (i  == 20){
//                try {
//                    t1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
    }
}
class PrintEvenNumber extends Thread{
    public PrintEvenNumber() {
    }

    public PrintEvenNumber(Runnable target) {
        super(target);
    }

    public PrintEvenNumber(Runnable target, String name) {
        super(target, name);
    }

    public PrintEvenNumber(String name) {
        super(name);
    }

    @Override
    public void run() {
//        super.run();
        for (int i = 0; i <= 100; i++) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() +  ":"+
                        Thread.currentThread().getPriority()+ ":" + i);
            }
//            if (i % 20 == 0){
//                Thread.yield();
//            }
        }
    }
}
