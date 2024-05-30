package day10;

public class Display {
	
	private String name;
	private int age;
	private int id;
	
	

	public Display(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Id : " + id );
	}



	public static void main(String[] args) {

		Display d=new Display("vijaya", 22, 44);
	    d.toString();
	    System.out.println(d);
		
	}

}
