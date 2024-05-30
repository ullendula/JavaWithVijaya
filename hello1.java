package day4;

public class hello1 {

	int empcode=1;
	String city;
	String name;
	
	
	public String toString() {
		return "hello1 [empcode=" + empcode + ", city=" + city + ", name=" + name + "]";
	}
	
	public hello1(int empcode, String city, String name) {
		super();
		this.empcode = empcode;
		this.city = city;
		this.name = name;
	}
	
	public static void main(String[] args) {
		hello1 h = new hello1(123,"mumbai","vijaya");
		System.out.println(h);
	}
	
	
}
