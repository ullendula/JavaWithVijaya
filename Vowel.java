package day5;

public class Vowel {

	public static void main(String[] args) {
		
		String str = ("i");
		
		for(int i=0;i<=str.length();i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)== 'i' || str.charAt(i)=='o'
					|| str.charAt(i)=='u')
			{
				System.out.println("given string is a vowel " + str);
			}
			else
				System.out.println(" it is not vowel " + str);
		}
		

	}

}
