package day7;

import java.util.Scanner;

public class Mutiple {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		
		int num=s.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num + " * " + i + " = " + num*i );
		}
		
	}

}
