package activities;

import java.util.ArrayList;

import java.util.List;

public class Activity9 {

	public static void main(String[] args) {

		List<String> myList= new ArrayList<String>();
		myList.add(0, "name1");
		myList.add(1, "name2");
		myList.add(2,"name3");
		myList.add(3,"name4");
		myList.add(4, "name5");
		
		int size = myList.size();
		
		System.out.println("The size of the array is :"+size);
		for (String myLists : myList) {
		
		System.out.println("printing the all the 5 Names :" + myLists);
		
	}
		if(myList.contains("name1"))
		{
			System.out.println("The given Elements is exist in List :"+ myList);
		}
		else 
			System.out.println("The given number is not exist in array");
		
		Object remove = myList.remove(0);
		System.out.println("remove the names:"+ remove);
		System.out.println("Print the size again "+ myList.size());
		
	
	System.out.println("Thrid Element from the List is :"+ myList.get(2));
		
	}

}
