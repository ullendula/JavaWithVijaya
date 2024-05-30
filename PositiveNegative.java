package day7;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int number =s.nextInt();
		System.out.println("Enter any number : " + number);
		 
	    if (number > 0) {
	 
	      System.out.println(number + " is positive.");
	 
	    } else if (number < 0) {
	 
	      System.out.println(number + " is negative.");
	 
	    } else {
	 
	      System.out.println(number + " is zero.");
	 
	    }
	 

	}

}
