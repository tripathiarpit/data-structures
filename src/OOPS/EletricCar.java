package OOPS;

public interface EletricCar {
    public void charge();
    public default void run(){
        System.out.println("I am running");
    }
}
