package qihang03.threadsafe;

import javax.swing.*;

public class WindowTest1 {
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
    @Override
    public void run() {
        while(this.isFlag){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            synchronized (obj) {

            this.show();
        }
    }

    public  synchronized void show(){ //此时同步监视器 this 不唯一  线程不安全
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
