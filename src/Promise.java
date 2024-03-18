import java.util.ArrayList;
import java.util.function.Function;

class MyPromise<T> {
    String status;
    T value;
    T reason;
    ArrayList<MyInterface<T>> onResolveCallbacks;
    ArrayList<MyInterface<T>> onRejectCallbacks;

    MyPromise(MyInterface2<MyInterface<T> ,MyInterface<T>> executor) throws Exception {
        this.status = "pending";
        this.value = null;
        this.reason = null;
        this.onResolveCallbacks = new ArrayList<>();
        this.onRejectCallbacks = new ArrayList<>();
        MyInterface<T> reject  = (T reason) -> {
            if (this.status == "pending") {
                this.status = "rejected";
                this.reason = reason;
                this.onRejectCallbacks.forEach(func -> {
                    try {
                        func.callback(reason);
                    } catch (Exception e) {
                        this.status = "rejected";
                        System.out.println("Exception in Reject");
                    }
                });
            }
        };
        MyInterface<T> resolve = (T value) -> {
            if (this.status == "pending") {
                this.status = "fulfilled";
                this.value = value;
                this.onResolveCallbacks.forEach(func -> {
                    try {
                        func.callback(value);
                    } catch (Exception e) {
                        System.out.println("Exception in Resolve");
                        this.status = "pending";
                        try {
                            reject.callback((T) e.getMessage());
                        } catch (Exception exe) {
                            this.status = "rejected";
                            System.out.println("Exception caught in resolve");
                        }
                    }
                });
            }
        };



        try {
            executor.callback(resolve, reject);
        } catch (Exception exe) {
            reject.callback((T) exe.getMessage());
        }
    }

    MyPromise<T> then (MyInterface<T> onFulfilled, MyInterface<T> onRejected) throws Exception {
        if (this.status == "fulfilled") {
            onFulfilled.callback(this.value);
        } else if (this.status == "rejected") {
            onRejected.callback(this.reason);
        } else if (this.status == "pending") {
            this.onResolveCallbacks.add(onFulfilled);
            this.onRejectCallbacks.add(onRejected);
            System.out.println("CalbackSet");
        }
        return  this;
    }
}

public  class Promise {

    public static void main(String[] args) {
        MyInterface2<MyInterface<Integer>,MyInterface<String>> executor = (resolve,reject)-> {
            {
                // Simulate an asynchronous operation
                new Thread(()->{
                    try {
                        Thread.sleep(2000);
                        try {
                            resolve.callback(123);
                        } catch (Exception e) {
                            System.out.println("Exception while calling");
                        }

                    } catch (InterruptedException | ArithmeticException e) {
                      //  System.out.println(e.getMessage());
                        try {
                            reject.callback(e.getMessage());
                        } catch (Exception exe) {

                        }

                       // throw new RuntimeException(e);
                    }
                }).start();

            }
        };
        try {
            MyPromise<Integer> myPromise = new MyPromise(executor);
            myPromise.then((arg -> {
                System.out.println(arg/0);
            }),System.out::println);
        } catch (Exception e) {

        }

    }
}

// Example usage:

