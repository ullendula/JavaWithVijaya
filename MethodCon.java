package day7;

public class MethodCon {
	
	public  MethodCon()
	{
		System.out.println("default cons");
	}
	
	public MethodCon(int a,int b)
	{
		System.out.println("with two parameters ");
	}
	
	public MethodCon(String name)
	{
		System.out.println("name is "+ name);
	}

	public static void main(String[] args) {
	
		MethodCon myobj1=new MethodCon();
		MethodCon myobj2=new MethodCon(2,4);
		MethodCon myobj3=new MethodCon("vijaya");
		System.out.println(myobj1);
		System.out.println(myobj2);
		System.out.println(myobj3);
	}

}
