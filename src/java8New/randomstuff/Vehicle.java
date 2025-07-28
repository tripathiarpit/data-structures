package java8New.randomstuff;

public class Vehicle {
    private String name;
    private VehicleType type;
    private FuelInjectorType injectorType;


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", injectorType=" + injectorType +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public FuelInjectorType getInjectorType() {
        return injectorType;
    }

    public void setInjectorType(FuelInjectorType injectorType) {
        this.injectorType = injectorType;
    }

    Vehicle() {

    }
    Vehicle(String name, VehicleType type) {
        this.name = name;
        this.type = type;

    }
    Vehicle(String name, VehicleType type, FuelInjectorType fuelInjectorType) {
        this.name = name;
        this.type = type;
        this.injectorType = fuelInjectorType;
    }

}
