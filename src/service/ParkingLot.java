package service;

import java.util.ArrayList;
import java.util.List;
import model.ParkingSlot;
import model.Vehicle;

public class ParkingLot {
 
    private List<ParkingSlot> slots = new ArrayList<>();
 
    public ParkingLot(int size) 
    {
        for (int i = 1; i <= size; i++)
        {
            slots.add(new ParkingSlot(i));
        }
    }
 
    
    public void parkVehicle(Vehicle v) 
    {
 
        for (ParkingSlot slot : slots) 
        {
 
            if (!slot.isOccupied()) 
            {
                slot.park(v);
                System.out.println("Vehicle " + v.getNumber() + " parked at slot " + slot.getSlotId());
                return;
            }
        }
 
        System.out.println("Parking Full");
    }
   
    public void unparkVehicle(int slotId, int hours) 
    {
 
        ParkingSlot slot = slots.get(slotId - 1);
 
        if (!slot.isOccupied()) 
        {
            System.out.println("Slot already empty");
            return;
        }
 
        Vehicle v = slot.getVehicle();
 
        double bill = v.calculateBill(hours);
 
        slot.unpark();
 
        System.out.println("Vehicle " + v.getNumber() + " exited");
        System.out.println("Bill: " + bill);
    }
    
}
 