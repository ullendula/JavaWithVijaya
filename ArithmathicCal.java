package day7;

import java.util.Scanner;

public class ArithmathicCal {

	public int add(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	
	public int sub(int a,int b)
	{
		int z=a-b;
		return z;
		
	}
	
	public int div(int a,int b)
	{
		int x=a/b;
		return x;
		
	}
	
	public int mul(int a,int b)
	{
		int t=a*b;
		return t;
		
	}
	
	public int mod(int a,int b)
	{
		int y=a%b;
		return y;
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		ArithmathicCal myobj=new ArithmathicCal();
		
		int b=myobj.sub(7, 8);
		System.out.println(b);
		
		int c=myobj.div(7, 8);
		System.out.println(c);
		
		int d=myobj.mul(7, 8);
		System.out.println(d);
		
		int e=myobj.mod(7, 8);
		System.out.println(e);

	}

}
