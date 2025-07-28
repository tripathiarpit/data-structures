package DS.threads;

import java.util.concurrent.Executors;

public class ExampleThread implements   Runnable{
    ExampleThread() {
        super();
    }
    @Override
    public void run() {
        System.out.println("Hello Inside Run  method: Current Thread ::"+ Thread.currentThread().getName());
        System.out.println("Hello Run");
    }

    public static void main(String[] args) {
        System.out.println("Hello Inside Main method: Current Thread ::"+ Thread.currentThread().getName());
        ExampleThread ts = new ExampleThread();
        Thread tt = new Thread(ts);
        tt.start();
        tt.start();
       // new Thread(()-> System.out.println("Hello"));
        System.out.println("Hello Inside Main method Thread Started");
        System.out.println("Hello Main");


    }
}
