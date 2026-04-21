package model;

public class Bike extends Vehicle 
{
	
    public Bike(String number) 
    {
        super(number);
    }

   // @Override
    
    public double calculateBill(int hours) 
    {
        return hours * 10;
    }
}