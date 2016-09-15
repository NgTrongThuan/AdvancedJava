package Ex63;

import java.text.DecimalFormat;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 14/08/2016
 * @version: 1.0
 *
 */
public class Student {
	private String name;
	private int level;
	private double markFisrtSemester;
	private double markSecondSemester;
	
	public Student() {
		super();
	}

	public Student(String name, int level, double markFisrtSemester,
			double markSecondSemester) {
		super();
		this.name = name;
		this.level = level;
		this.markFisrtSemester = markFisrtSemester;
		this.markSecondSemester = markSecondSemester;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getMarkFisrtSemester() {
		return markFisrtSemester;
	}

	public void setMarkFisrtSemester(double markFisrtSemester) {
		this.markFisrtSemester = markFisrtSemester;
	}

	public double getMarkSecondSemester() {
		return markSecondSemester;
	}

	public void setMarkSecondSemester(double markSecondSemester) {
		this.markSecondSemester = markSecondSemester;
	}
	
	/**
	 * function calculator avg grade
	 */
	public double calAvg(){
		return (markFisrtSemester + markSecondSemester * 2) / 3;
	}
	public void showInformation(){
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("----------------------------------");
		System.out.println("Name: " + name);
		System.out.println("Class: " + level);
		System.out.println("Grade of semester 1: " + markFisrtSemester);
		System.out.println("Grade of semester 2: " + markSecondSemester);
		System.out.println("Avg grade: " + Double.parseDouble(df.format(calAvg())));
		System.out.println("----------------------------------");
	}
	
}
