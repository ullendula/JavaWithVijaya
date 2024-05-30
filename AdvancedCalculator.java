package day10;

class Calculator {

	public int add(int a, int b) {

		return a + b;
	}
}

public class AdvancedCalculator extends Calculator {
	public int add(int a, int b, int c) {
		return super.add(a, b) + c;

	}

	public static void main(String[] args) {

		AdvancedCalculator calc = new AdvancedCalculator();

		int result1 = calc.add(5, 10); // Using the superclass method
		int result2 = calc.add(5, 10, 15); // Using the subclass method

		// Output the results
		System.out.println("Result 1: " + result1); // Output: 15
		System.out.println("Result 2: " + result2); // Output: 30
	}

}
