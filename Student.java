package day10;

public class Student {

	private int id;
	private String name;
	private boolean active;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public static void main(String[] args) {

		Student s=new Student();
		s.setId(56);
		s.setName("soni");
		s.setActive(true);
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.isActive());
		
	}

}
