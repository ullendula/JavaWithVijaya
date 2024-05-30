package day7;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=s.nextInt();
		int rev=0;
		
		while(num != 0)
		{
			int rem=num % 10;
			rev = rev * 10 + rem;
			num /=10;
		}
		System.out.println(rev);
		
	}

}
