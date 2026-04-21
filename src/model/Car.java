package model;

public class Car extends Vehicle 
{
    public Car(String number) 
    {
        super(number);
    }

   // @Override
    public double calculateBill(int hours) 
    {
        return hours * 20;
    }
}