package main;

import model.Bike;
import model.Car;
import model.Vehicle;
import service.ParkingLot;

public class Main {

    public static void main(String[] args) 
    {

        ParkingLot lot = new ParkingLot(4);

        Vehicle BMW = new Car("MH12AB1234");
        Vehicle bike = new Bike("MH14XY5678");
        Vehicle TATA = new Car("MH10EG7814");
        Vehicle Bajaj = new Bike("MH12ET6578");
        Vehicle honda = new Car ("MH19ET6599");

        lot.parkVehicle(BMW);
        lot.parkVehicle(bike);
        lot.parkVehicle(TATA);

        System.out.println("------------------");        
        
        /*
        lot.unparkVehicle(1, 2);
        lot.unparkVehicle(3, 8);
        lot.unparkVehicle(2, 3);
         */

        lot.parkVehicle(Bajaj);
        lot.parkVehicle(honda);
                
    }
}
