package threads;

public class JoinExample implements Runnable{
    Thread thread;
    JoinExample(String threadName){
        thread = new Thread(this, threadName);
    }
    public void run() {
        repeat();
    }

    private synchronized void repeat() {
        for(int i = 5;i>=0; i--) {
            System.out.println("Current Thread is:"+ Thread.currentThread().getName()+", ");
            System.out.println("Value of I is :"+ i);
        }
    }

    public static void main(String[] args) {
        JoinExample  t1= new JoinExample("Alpha");
        JoinExample  t2= new JoinExample("Beta");
        JoinExample  t3= new JoinExample("Charlie");
        t1.thread.start();
        t2.thread.start();
        t3.thread.start();
        try {
            t1.thread.join();
            t2.thread.join();
            t3.thread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("********Current Thread************8 :"+ Thread.currentThread().getName()+", ");
    }
}
