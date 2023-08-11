package qihang01.create;

/**
 * 线程作为CPU调度和执行的最小单位
 *
 */
public class ThreadTest{
    public static void main(String[] args) {
//        PrintEvenNumber printNumber1 = new PrintEvenNumber(200);
//
//        PrintOddNumber printNumber2  = new PrintOddNumber(200);
//        printNumber1.start();
//        printNumber2.start();
        //匿名子类的匿名对象
        new PrintEvenNumber(200){
            public void run() {
                for (int i = 0; i <= 2000; i++) {
                    if (i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();
        for (int i = 0; i <= 200; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }

}
class PrintEvenNumber extends Thread{
    private int number;
    public PrintEvenNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
//        super.run();
        for (int i = 0; i <= this.number; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
class PrintOddNumber extends Thread{
    private int number;
    public PrintOddNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
//        super.run();
        for (int i = 0; i <= this.number; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
