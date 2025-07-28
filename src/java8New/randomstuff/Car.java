package java8New.randomstuff;

import java.util.Date;

public class Car extends Vehicle{
    private Date manufactureYear;
    private int engineCC;

    public Date getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(Date manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineCC=" + engineCC +
                super.toString()+
                '}';
    }

    Car() {
        super();
       Date d =  new Date();
       d.setYear(2018);
        this.setManufactureYear(d);
    }
    Car(String name, VehicleType type) {

        super(name, type);
        Date d =  new Date();
        d.setYear(2018);
        this.setManufactureYear(d);
    }

}
