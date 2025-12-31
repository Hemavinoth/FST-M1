package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
	private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
	
	public Plane()
	{
		this.maxPassengers=maxPassengers;
		this.passengers=new ArrayList<>();
		
	}
	
	public void onboard(String passengersName)
	{
		if(passengers.size()<=maxPassengers)
		{
			this.passengers.add(passengersName);
			
		}else
			System.out.println("Plane is full");
	}
	public Date takeoff()
	{
		return this.lastTimeTookOf=new Date();
	}
	public void land()
	{
		this.lastTimeLanded= new Date();
		this.passengers.clear();
		
	}
	
	public Date getLastTimeLanded() {
		return lastTimeLanded;
		
	}
public List<String> getPassengers()
{
	return passengers;
	
}
    
}

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		
Plane plan= new Plane();
plan.onboard("Hema");
plan.onboard("latha");
plan.onboard("Riya");
System.out.println("take off :"+ plan.takeoff());
System.out.println("passengers in plan"+ plan.getPassengers());
Thread.sleep(5000);
plan.land();
System.out.println(plan.getLastTimeLanded());
System.out.println(plan.getPassengers());
	

	}

}
