package java8New.randomstuff;

public interface Engine<T extends Vehicle>{
    public T start(VehicleType type);
}
