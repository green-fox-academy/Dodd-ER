package petrol.station;

import java.util.ArrayList;
import java.util.List;

public class Main {
//    Create Station and Car classes
//       Station:
//          gasAmount
//          refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
//       Car
//          gasAmount
//          capacity
//          create constructor for Car where:
//          initialize gasAmount -> 0
//          initialize capacity -> 100
    public static void main(String[] args) {
        Station benzinStation = new Station();
        List<Car> listOfCars = new ArrayList<>(4);

        for (Car elements : listOfCars){
            System.out.println("Car's gas amount before refill: " + elements.gasAmount);
            benzinStation.refill(elements);
            System.out.println("Car's gas amount after refill: " + elements.gasAmount);
        }
    }
}
