package day_2_HomeWork;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int n1,n2,ch ,cal;
		System.out.println("Enter two Numbers : ");
		
		Scanner s=new Scanner(System.in);
		
		n1=s.nextInt();
		n2=s.nextInt();
		
		System.out.println("select Operation ");
		ch=s.nextInt();
		
		if(ch==1)
		{
			cal=n1+n2;
			System.out.println("ADDITION " + cal);
		}
		else if(ch==2)
		{
			cal=n1-n2;
			System.out.println("SUBTRACTION " + cal);
		}
		
		else if(ch==3)
		{
			cal=n1*n2;
			System.out.println("MULTIPLICATION " + cal);
		}
		else if(ch==4)
		{
			cal=n1/n2;
			System.out.println("DIVISION " + cal);
		}
		else
		{
			cal=n1%n2;
			System.out.println("REMAINDER " + cal);
		}

	}

}
