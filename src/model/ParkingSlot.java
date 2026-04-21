package model;
 
public class ParkingSlot {
 
    private int slotId;
    private boolean occupied;
    private Vehicle vehicle;
 
    public ParkingSlot(int slotId) 
    {
        this.slotId = slotId;
        this.occupied = false;
    }
 
    public boolean isOccupied() 
    {
        return occupied;
    }
 
    public void park(Vehicle v) 
    {
        this.vehicle = v;
        this.occupied = true;
    }
 
    public void unpark() 
    {
        this.vehicle = null;
        this.occupied = false;
    }
 
    public int getSlotId() 
    {
        return slotId;
    }
 
    public Vehicle getVehicle() 
    {
        return vehicle;
    }
}