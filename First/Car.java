package Deneme;

public class Car extends Vehicle implements IBody,IEngine {

	int numPlate;
	
	
	public Car(String make, String model, int year,int numPlate) {
		super(make, model, year);
		this.numPlate=numPlate;
		
	}

	@Override
	public void setTransmission(String Transmission) {
		this.transmission=Transmission;
		
	}

	@Override
	public void getTransission() {
		System.out.println(this.transmission);
		
	}

	@Override
	public void setColor(String Color) {
		this.color=Color;
		
		
	}

	@Override
	public void getColor() {
		System.out.println(this.color);
		
	}

	@Override
	void showVehicle() {
		System.out.println(this.make);
		System.out.println(this.model);
		System.out.println(this.color);
		System.out.println(this.transmission);
		System.out.println(this.year);
		System.out.println(this.numPlate);
		
	}
	
	
	
	
	
	

}
