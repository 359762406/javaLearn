package qihang05.communication;

public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer consumer1 = new Consumer(clerk);
        Consumer consumer2 = new Consumer(clerk);
        producer.setName("生产者");
        consumer1.setName("消费者1");
        consumer2.setName("消费者2");
        producer.start();
        consumer1.start();
        consumer2.start();
    }
}

class Clerk{
    private int productNumber = 0;

    //增加产品数量
    public synchronized void addProduct(){
        if(this.productNumber >= 20){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{

            productNumber ++;
            System.out.println(Thread.currentThread().getName() +
                    "生产了第" + productNumber + "个产品");
            this.notifyAll();
        }


    }

    //减少产品数量
    public synchronized void subProtect(){
        if (this.productNumber <= 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{

            System.out.println(Thread.currentThread().getName() +
                    "消费了第" + productNumber + "个产品");
            productNumber --;
            this.notifyAll();
        }
    }
}

class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("生产者开始生产产品");
//            try {
//                Thread.sleep(20);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            this.clerk.addProduct();

        }
    }
}

class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("消费者开始消费产品");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            this.clerk.subProtect();

        }
    }
}