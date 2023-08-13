package qihang06.createMore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *  线程池
 * 那么有没有一种办法使得线程可以复用，即执行完一个任务，并不被销毁，
 *  而是可以继续执行其他的任务?
 * 思路:提前创建好多个线程，放入线程池中，使用时直接获取，使用完放回池中。
 *     可以避免频繁创建销毁、实现重复利用。类似生活中的公共交通工具。
 *此方式的好处。
 * 提高了程序执行的效率。《(因为线程已经提前创建好了)
 * 提高了资源的复用率。《因为执行完的线程并未销毁，而是可以继续执行其他的任务)
 * 可以设置相关的参数,对线程池中的线程的使用进行管理
 *
 *
 *
 */
public class ThreadPool {
    public static void main(String[] args) {
        //1.提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        //设置线程池的属性
        //system.out.println(service.getclass());//ThreadPoolExecutor
        service1.setMaximumPoolSize(50);//设置线程池中线程数的上限
        //2.执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new NumberThread1());//透合适用于Runnable
        service.execute(new NumberThread2());//适合适用于Runnable
        //service.submit(new NumberThread1());//适合使用于Callable
        //3.关闭连接池
        service.shutdown( );

    }
}
class NumberThread1 implements Runnable{
    @Override
    public void run() {

    }
}
class NumberThread2 implements Runnable{
    @Override
    public void run() {

    }
}