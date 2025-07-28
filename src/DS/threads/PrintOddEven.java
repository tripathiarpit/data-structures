package DS.threads;

import java.util.concurrent.ExecutionException;

public class PrintOddEven {

    Object obj;
    private int counter = 1;
    private int max = 10;
    Thread t1 = new Thread(()->{
        Thread.currentThread().setName("Even");
        while (counter <=max) {
            synchronized (this.obj) {
            if (counter % 2 == 0) {
                System.out.println("Thread Name::"+ Thread.currentThread().getName()+",Number::"+ counter);
               // this.obj.notify();
                counter++;
            } else {
                try {
                    obj.wait(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        }



    });
    Thread t2 = new Thread(()->{
        Thread.currentThread().setName("ODD");
        while (counter <= max) {
            synchronized (this.obj) {
            if (counter % 2 != 0) {
                System.out.println("Thread Name::"+ Thread.currentThread().getName()+",Number::"+ counter);
                counter ++;
               // obj.notify();
            } else {
                try {
                    obj.wait(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        }


    });

    public static void main(String[] args) {
        PrintOddEven ps  = new PrintOddEven();
        ps.obj = new Object();
        ps.t1.start();
        ps.t2.start();
    }
}
