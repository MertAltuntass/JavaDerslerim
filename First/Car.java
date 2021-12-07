package Deneme;

public class Car extends Vehicle implements IBody,IEngine {

	int numPlate;
	
	
	public Car(String make, String model, int year,int numPlate) {
		super(make, model, year);
		
	}

	@Override
	public void setTransmission(String Transmission) {
		this.transmission=Transmission;
		
	}

	@Override
	public void getTransission() {
		System.out.println();
		
	}

	@Override
	public void setColor(String Color) {
		this.color=Color;
		
		
	}

	@Override
	public void getColor() {
		System.out.println();
		
	}

	@Override
	void showVehicle() {
		System.out.println();
		
	}
	
	
	
	
	
	

}
