package qihang04.threadsafeMore.deadLock;

/**
 * 1.如何看待死锁?
 * 不同的线程分别占用对方需要的同步资源不放弃，
 *  都在等待对方放弃自己需要的同步资源，就形成了线程的死锁。
 *  我们编写程序时，要避免出现死锁。
 * 2.诱发死锁的原因:
 *      互斥条件
 *      占用且等待
 *      不可抢夺(或不可抢占)
 *      循环等待
 *  以上4个条件，同时出现就会触发死锁。
 * 3.解决死锁:
 * 死锁一旦出现，基本很难人为干预，只能尽量规避。可以考虑打破上面的诱发条件。
 *  针对条件1:互斥条件基本上无法被破坏。因为线程需要通过互斥解决安全问题。
 *  针对条件2:可以考虑一次性申请所有所需的资源，这样就不存在等待的问题。
 *  针对条件3:占用部分资源的线程在进一步申请其他资源时，如果申请不到，就主动释放掉已经占用的资源
 *  针对条件4∶可以将资源改为线性顺序。申请资源时，先申请序号较小的，这样避免循环等待问题。
 */
public class DeadLock {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        new Thread(){
            @Override
            public void run() {
                synchronized (s1){
                    s1.append("a");
                    s2.append("1");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    synchronized (s2){
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                synchronized (s2){
                    s1.append("c");
                    s2.append("3");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    synchronized (s1){
                        s1.append("d");
                        s2.append("4");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();
    }
}
