package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		
		hs.add("1Apple");
		hs.add("mango");
		hs.add("boost");
		hs.add("chiku");
		hs.add("lemon");
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.remove("chiku"));
		System.out.println(hs.remove("banana"));
		System.out.println(hs.contains("mango"));
		System.out.println(hs.size());
		System.out.println(hs);
		
		
		
	}

}
