package day8;

class Dog extends Animal {

	public void makeNoise() {
		bark();
	}

	public void bark() {
		System.out.println("bark");
	}
}

public class Animal {

	protected void makeNoise() {
		System.out.println("Don't know what noise to make.");
	}
	
	public void bark() {
		System.out.println("don't bark....");
	}

	public static void main(String[] args) {
		
		Animal obj=new Animal();
		obj.makeNoise();
		obj.bark();
		

		
	}

}
