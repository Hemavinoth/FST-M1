package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
	
	public static void main(String[] args) {
		
	HashMap<Integer,String> colors = new HashMap<Integer, String>();
	
	colors.put(1,"Red");
	colors.put(2, "Blue");
	colors.put(3, "Green");
	colors.put(4, "Yellow");
	
	System.out.println("The colors added"+ colors);
	
	colors.remove(2);
	
	System.out.println("The removed colors"+ colors);
	
	if (colors.containsValue("Green"))
	{
		System.out.println("print the colors Green Exists");
	}
	else
		System.out.println("Print the color green not exists");
	System.out.println("Print the size"+colors.size());
}
}

