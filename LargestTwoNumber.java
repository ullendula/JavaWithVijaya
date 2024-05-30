package day4;

public class LargestTwoNumber {

	public static void main(String[] args) {
		
		int num1 = 5 ,num2=5 ,num3=5;
		if(num1 == num2 && num1 == num3 && num2 == num3)
			System.out.println("both are equal");
		else if(num1 > num2 && num2>num3 )
			System.out.println(num1 + " is greater");
		else if(num1<num3)
			System.out.println(num3 + " is greater");
		else
			System.out.println(num2 + " is greater");
	}

}
