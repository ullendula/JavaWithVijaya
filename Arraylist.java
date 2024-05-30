package day4;

import java.util.ArrayList;

public class Arraylist {
	
	public static void main(String[] args) {
		
		ArrayList<String> colorlist =new ArrayList<String>(2);
		colorlist.add("yellow");
		colorlist.add("navy blue");
		
		for(String value: colorlist) {
			System.out.println("values from arraylist : " + value);
			
		}
		Object[] obj=colorlist.toArray();
		for(Object value2:obj)
		{
			System.out.println("Values from array: " + value2);
		}
		
	}

}
