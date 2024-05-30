package day8;

public class Person {
	
	private String name;
	public Person()
	{
	name = "No name yet.";
	}
	public Person(String initialName)
	{
	name = initialName;
	}
	public void setName(String newName)
	{
	name = newName;
	}
	public String getName()
	{
	return name;
	}
	public void writeOutput()
	{
	System.out.println("Name: " + name);
	}

	public static void main(String[] args) {
		Person obj=new Person();
		obj.setName("vijaya");
		System.out.println(obj);
		
		

	}

}
