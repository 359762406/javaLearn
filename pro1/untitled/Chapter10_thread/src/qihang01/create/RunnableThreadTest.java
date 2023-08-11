package qihang01.create;

/**
 * 共同点：
 *  启动线程，使用的都是Thread类中定义的start()
 *  创建的线程对象。都是Thread类或其子类的实例。
 * 不同点：
 *  一个是类的继承，一个是接口的实现。
 *  建议：使用Runnable接口的实现方式
 *  Runnable方式的好处：
 *      1.实现的方式,避免的类的单继承的局限性
 *      2.更适合处理有共享数据的问题
 *      3.实现了数据和代码的分离
 * 联系：
 *  public class Thread implements Runnable
 *      Thread方法实现了Runnable接口，继承Thread就是实现了Runnable接口 （代理模式）
 */
public class RunnableThreadTest {
    public static void main(String[] args) {
        /*
        * 代理模式
        * */
//        EvenNumberPrint evenNumberPrint = new EvenNumberPrint();
//        Thread t = new Thread(evenNumberPrint);
//        t.start();
//
//        Thread t1 = new Thread(evenNumberPrint);
//        t1.start();
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0){
//                System.out.println(Thread.currentThread().getName() + " " + i);
//            }
//        }
        /*
        * 提供了Runnable接口的匿名实现类的匿名对象
        * */
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + " " + i);
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + " " + i);
                    }
                }
            }
        }).start();
    }

}
/*
* 用Runnable接口进行实现
* */
class EvenNumberPrint implements Runnable{
    private double money  = 1000; // 线程共用
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}
