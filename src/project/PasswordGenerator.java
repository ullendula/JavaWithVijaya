package project;

import java.util.Random;

public class PasswordGenerator {

	public static void main(String[] args) {

		String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String num="0123456789";
		String specialChars="<>,.?/}]{"
				+ "]+_-)(*&^%$#@!= ";
		String combo=upper+lower+specialChars+num;
		int len=8;
		char[] password=new char[len];
		Random r=new Random();
		for(int i=0;i<len;i++)
		{
			password[i]=combo.charAt(r.nextInt(combo.length()));
			
		}
		System.out.println("Generated Password is : " + new String(password));
		
		
	}

}
