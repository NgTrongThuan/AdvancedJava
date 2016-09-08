package Ex25;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 8/9/2016
 * @version : 1.0
 * --------------------------
 * create class Employee to manage class
 */
public class Employee {
	private String name;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void show(){
		System.out.println("---------------------------------");
		System.out.println("name: " + name);
		System.out.println("salary: " + salary);
		System.out.println("---------------------------------");
	}
}
