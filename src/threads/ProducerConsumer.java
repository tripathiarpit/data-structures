package threads;

import java.util.ArrayList;

public class ProducerConsumer {
    public static void main(String[] args) {
        DataStore d = new DataStore();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.t.start();
        c.t.start();
    }

}

class DataStore {
    private String message;
    boolean hasStored = false;

    public synchronized  void setMessage(String message) {
        while (hasStored) {
            try {
                wait();
            }
            catch (Exception e) {
                System.out.println("Execption Occoured");
            }
        }
        this.message= message;
        hasStored = true;
        System.out.println("Message Produced:"+ this.message);
        notify();
    }
    public synchronized String getMessage() {
        while (!hasStored) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Execption Occoured");
            }
        }

        System.out.println("Message Received:"+ this.message);
        hasStored = false;
        notify();
        return this.message;
    }
}

class Producer implements  Runnable {
    DataStore d;
    Thread t;
    Producer(DataStore d) {
        this.d = d;
        t = new Thread(this,"Producer");
    }
    public void run() {
        ArrayList<String> months = new ArrayList<>();
        months.add("JAN"); months.add("FEB");
        months.add("MARCH"); months.add("APRIL");
        months.add("MAY"); months.add("JUNE");
        months.add("JULY"); months.add("AUGUST");
        months.add("SEPT"); months.add("OCT");
        months.add("NOV"); months.add("DEC");
         months.forEach(data->{
            d.setMessage(data);
         });
    }
}
class Consumer implements  Runnable {
    DataStore d;
    Thread t;
    Consumer( DataStore d) {
        this.d  =d ;
        t = new Thread(this,"Consumer");
    }
    public void run() {
        while (true){
            d.getMessage();
        }

    }
}
