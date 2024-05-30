package demo;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println(" Enter First number ");
		int a=s.nextInt();
		
		System.out.println(" Enter Second number ");
		int b=s.nextInt();
		
		int sum=a+b;
		System.out.println("sum of two number "+ sum);
		
	}

}
