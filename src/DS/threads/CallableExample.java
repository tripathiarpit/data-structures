package DS.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

    public static void main(String[] args) {
        Integer  counter = 0;
        Runnable  evenPrinter = () -> {
            for (int i = 0; i < 10; i++) {

                synchronized (counter) {
                    try {
                        if (i % 2 == 0) {
                            System.out.println("Even:" + i);

                        } else {
                            counter.wait(1000);
                        }
                    } catch (Exception e) {

                    }


                }

            }

        };
        Runnable  oddPrinter = () -> {
            for (int i = 0; i < 10; i++) {
                synchronized (counter) {
                    try {
                        if (i % 2 != 0) {
                            System.out.println("Odd:" + i);

                        } else {
                            counter.wait(1000);
                        }
                    }
                    catch(Exception e) {

                    }
                }
            }

        };

        ExecutorService executorService = null;
        try {
            Thread future[] = new Thread[20000];
            executorService = Executors.newFixedThreadPool(20000);
            for (int i = 0; i <200000 ; i++) {
                if(i%2==0)
                future[i] = new Thread(evenPrinter);
                else
                future[i] = new Thread(oddPrinter);
                future[i].start();
            }



        } catch (Exception e) {

        } finally {
            executorService.shutdown();
        }


    }
}
