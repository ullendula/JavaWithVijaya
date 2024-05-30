package day_2_HomeWork;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		int n,cout=0;
		System.out.print("Enter any number : ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) {
				cout++;
			}
		}
		if(cout==2)
		{
			System.out.println("it is a prime number");
		}
		else
			System.out.println("it is not a prime number");
		
	}

}
