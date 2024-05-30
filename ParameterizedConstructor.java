package day8;

public class ParameterizedConstructor {

	public class Person {
	    private String name;
	    private int age;

	    // Parameterized constructor
	    public Person(String string, int i) {
	        this.name = name;
	        this.age = age;
	    }

		// Getter for name
	    public String getName() {
	        return name;
	    }

	    // Getter for age
	    public int getAge() {
	        return age;
	    }

	    // Setter for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Setter for age
	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Method to display person details
	    public void displayPersonDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	public static void main(String[] args) {
		
		
	}

}
