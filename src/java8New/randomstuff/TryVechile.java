package java8New.randomstuff;

import java.time.Year;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TryVechile {
    public void tryandStart() {

        Engine<Car> carEngine = (vehicleType)-> {
            System.out.println("Car Engine Started"+ vehicleType);
            return new Car();
        };


        carEngine.start(VehicleType.LUXURY_CARS);

    }
    public List<Car> filterSuperCars(List<Car> vehicles, Predicate<Vehicle> vehicleFilter) {

               return vehicles.stream().filter(vehicleFilter).collect(Collectors.toList());
    }
    public void  deprecateCar(List<Car> vehicles, Consumer<List<Car>> deprecationMethod) {
        deprecationMethod.accept(vehicles);
    }

    public List<Vehicle> getVehiclesList(List<Car> cars, Function<Car,Vehicle> mapper) {
        return cars.stream().map(mapper).collect(Collectors.toList());
    }

    public void  assignDefaultFuelInjectorToEngine(List<Car> cars, Supplier<FuelInjectorType> defaultInjector) {
         cars.stream().forEach(car -> {
            if(car.getInjectorType() == null) {
                car.setInjectorType(defaultInjector.get());
            }
        });

    }



    public static void main(String[] args) {

        String inp = new String("Heello");
        Long  cpunt = inp.toLowerCase().chars().filter(ch-> "aeiou".indexOf(ch)!=-1).count();
        System.out.println("Volwels"+cpunt);






//        TryVechile tryVechile = new TryVechile();
////        tryVechile.tryandStart();
//        List<Car> cars = Arrays.asList(new Car("Fiesta", VehicleType.BUDGET_CAR),
//                new Car("EGGD", VehicleType.BUDGET_CAR),
//                new Car("HYUNDIA VERNA", VehicleType.BUDGET_CAR),
//                new Car("ASTON MARTIN", VehicleType.SPORTS_CAR),
//                new Car("RANGEROVER", VehicleType.SPORTS_CAR));
//
//        Consumer<List<Car>> removeOldCars = list -> {
//            Iterator<Car> iterator = list.iterator();
//            while (iterator.hasNext()) {
//                Car model = iterator.next();
//                if ( new Date().getYear() - model.getManufactureYear().getYear() > 5) {
//                    iterator.next();
//
//                }
//            }
//        };
//        System.out.println("Before Dep::"+ cars.size());
//        Date d =  new Date();
//        d.setYear(2000);
//        cars.get(0).setManufactureYear(d);
//        tryVechile.deprecateCar(cars, removeOldCars);
//        System.out.println("After Dep::"+ cars.size());
//      List<Car>  filteredCard =  tryVechile.filterSuperCars(cars,vehicle -> vehicle.getType()== VehicleType.BUDGET_CAR);
//        System.out.println(filteredCard);

//        System.out.println("After"+filteredCard);
////
//        System.out.println("Final List of Without Injector  Vehicles::"+tryVechile.getVehiclesList(cars,(car)-> new Vehicle(car.getName(),car.getType())));
//        tryVechile.assignDefaultFuelInjectorToEngine(cars,()-> FuelInjectorType.DIRECT_INJECTION);
//        System.out.println("Final List of Vehicles::"+ cars);
   List<Vehicle> integerList = Arrays.asList(new Car());
        TryVechile.printList(integerList);



    }
    public  static   <T extends Vehicle> void printList(List<T> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }


}
