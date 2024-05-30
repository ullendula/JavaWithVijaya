package day8;

public class Employee {
	
	int empid;
	String name;
	
	

	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}


	void info()
	{
		System.out.println("ID :"  +empid+ "name :" + name );
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
