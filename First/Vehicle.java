package Deneme;

public abstract class Vehicle {
	
	String make, model, transmission, color;
	int year;
	
	
	public Vehicle(String make,String model,int year) {
		this.make=make;
		this.model=model;
		this.year=year;

	}
	
	abstract void showVehicle();

}
