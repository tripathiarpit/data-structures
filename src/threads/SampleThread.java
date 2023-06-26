package threads;

public class SampleThread implements Runnable{
    public synchronized void loopthrough() {
        for(int i=0;i<10;i++) {
            System.out.println("Hello:"+i +"Current Thread" + Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        this.loopthrough();
    }

    public static void main(String[] args) {
        SampleThread obj1 = new SampleThread();
        SampleThread obj2 = new SampleThread();
        Thread t1 = new Thread(obj1);
        t1.setName("First Thread");
        Thread t2 = new Thread(obj2);
        t2.setName("Second Thread");
        t1.start();
        t2.start();
    }
}
