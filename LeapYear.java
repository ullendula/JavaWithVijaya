package day7;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any year: ");
		
		year=s.nextInt();
		System.out.println("The entered year is : "+year);
		
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
			System.out.println("Enter year is Leap year: " + year);
		}
		else
			System.out.println("Common year");

		
	}

}
