package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyre;
	int door;
	
	Car()
	{
		tyre=4;
		door=4;
	}
	 void displayCharacteristics()
	{
		System.out.println("Color " + color);
		System.out.println("Transmission"+ transmission);
		System.out.println("make "+ make );
		System.out.println("Tyre" + tyre);
		System.out.println("door"+ door);
	}
	void accelarate()
	 {
		 System.out.println("Car is moving");
	 }
	void brake()
	{
		System.out.println("Car has stopped");
	}
	
		
		
	}


