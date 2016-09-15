package Ex43;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 12/09/2016
 * @version: 1.0
 * --------------------------
 * create class student
 *
 */
public class Student {
	private String name;
	private int age;
	private double mark1;
	private double mark2;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, double mark1, double mark2) {
		super();
		this.name = name;
		this.age = age;
		this.mark1 = mark1;
		this.mark2 = mark2;
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

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}
	
	/**
	 * function function calculate avg mark
	 * @return (mark1 + mark2 ) / 2
	 */
	public double calAvg(){
		return (mark1 + mark2 ) / 2;
	}
	
	/**
	 * function show information
	 */
	public void showInfo(){
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Name: " + name + "\t" + "age: " + age + "\t" + "mark 1: " + mark1 + "\t" + "mark 2: " + mark2 + "\t" + "avg: " + calAvg());
		System.out.println("-----------------------------------------------------------------------");
	}
}
