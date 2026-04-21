package model;

public class Vehicle 
{
	
	private String number; 
	
	public Vehicle(String number)
	{
		this.number=number;
	}
	
	public String getNumber() 
	{
		return number;
	}
	
	public double calculateBill(int hours)
	{
		return hours*5;
	}
}
