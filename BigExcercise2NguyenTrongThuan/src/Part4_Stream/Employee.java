package Part4_Stream;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 19/9/2016
 * @version: 1.0
 * create class Employee
 *
 */
public class Employee {
	String name;
	int age;
	double salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// show employee
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + String.format("%.2f", salary)
				+ "]";
	}	
}
