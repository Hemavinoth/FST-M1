package activities;


interface BicycleParts
{
	public int tyres = 2;
	public int maxSpeed = 25;
}

interface BicycleOperations
{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
	
}
class Bicycle implements BicycleOperations,BicycleParts
{
	
	private int gears;
	private int currentSpeed;

	Bicycle(int gears,int currentSpeed)
	{
		this.gears=gears;
		this.currentSpeed=currentSpeed;
	}
	
	@Override
	public void applyBrake(int decrement) {
		currentSpeed=currentSpeed-decrement;
		System.out.println(currentSpeed);
		
	}
	@Override
	public void speedUp(int increment) {
		
		currentSpeed=currentSpeed+increment;
		System.out.println(currentSpeed);
	}
	String bycycleDesc(){
		return ("Number of gear :" + gears + "maxspeed of :" +maxSpeed);
		
	}
	
}

class MountainBike extends Bicycle
{
	public int seatHeight;
	
	public MountainBike(int gears, int currentSpeed, int startHeight) {
		super(gears,currentSpeed);
		seatHeight=startHeight;
		
	}
		
		public void setHeight(int newValue)
		{
			int seatHieght = newValue;
		}
		
		public String bicycleDesc()
		{
			System.out.println("print the seat height");
			return super.bycycleDesc() + "Seat Height is : "+ seatHeight;
		}
	
	
}
public class Activity7 {

	public static void main(String[] args) {
		{
		    MountainBike mb = new MountainBike(3, 0, 25);
		    System.out.print(mb.bicycleDesc());
		    mb.speedUp(20);
		    mb.applyBrake(5);
		}

	}

}

