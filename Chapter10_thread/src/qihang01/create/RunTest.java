package qihang01.create;

public class RunTest {
    public static void main(String[] args) {
        Thread t1 = new A();
        t1.start();
        A a = null;
        if (t1 instanceof A) {
            a = (A) t1;
        }
        Thread t2 = new B(a);
        t2.start();
    }
}
class A extends Thread{
    @Override
    public void run() {
        System.out.println("线程A的run方法...");
    }
}

class B extends Thread{
    private A a;

//    public B(A a) {
//
//        this.a = a;
//    }
    public B(A a){
        super(a); // a实现了thread的实例 Runnable的多态
    }
//    @Override
//    public void run() {
//        System.out.println("线程b的run方法...");
//    }
}
