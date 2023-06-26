package OOPS;

public class SampleCar implements FullElectricCar, HybridCar{
    public void charge() {

    }

    @Override
    public void run() {
        FullElectricCar.super.run();
    }

    public static void main(String[] args) {
        SampleCar c = new SampleCar();
        c.run();
    }
}
