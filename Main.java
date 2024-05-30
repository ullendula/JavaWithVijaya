package day10;

class Persons {

	private String name;
	private int age;

	// Constructor
	public Persons(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Method to display person details
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

}

class Students extends Persons {

	private String studentID;

	public Students(String name, int age, String studentID) {
		super(name, age);
		this.setStudentID(studentID);
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Student ID: " + studentID);

	}

}

public class Main {

	public static void main(String[] args) {

		Students s = new Students("vijaya", 20, "S12345");
        s.display();
		
	}
}
