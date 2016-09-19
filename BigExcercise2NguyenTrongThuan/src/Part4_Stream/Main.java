package Part4_Stream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 19/9/2016
 * @version: 1.0 create class Employee controller
 *
 */
public class Main {

	public static void main(String[] args) {
		List<Employee> lst = new ArrayList<>();

		// create list 15 employee
		lst = createListEmp();
		System.out
				.println("+++++++++++++++++ List employee ++++++++++++++++++");
		for (Employee emp : lst) {
			System.out.println(emp.toString());
		}
		System.out
				.println("+++++++++++++++++++++++++++++++++++++++++++++++++\n");

		// call function show employees has salary > 3000000
		showEmployeeWithSalary(lst);

		// find employee have "Anh" in name
		List<Employee> lstName = new ArrayList<>();
		lstName = findEmployee(lst);
		if (lstName == null) {
			System.out.println("No employee in list have 'Anh' in name!");
		} else {
			System.out
					.println("\n+++++++++++++++ List employee have 'Anh' in name ++++++++++++++++++");
			for (Employee emp : lstName) {
				System.out.println(emp.toString());
			}
		}

		System.out
				.println("\n++++++++++++++++ Average of Age employee ++++++++++++++++++");
		System.out.println("Average of age: " + calAvgAge(lst));
		
		System.out
		.println("\n++++++++++++++++ Statistic salary employee ++++++++++++++++++");
		statisticSalary(lst);
	}

	// function add 15 employee to list employee -> return list employee
	public static List<Employee> createListEmp() {
		List<Employee> lst = new ArrayList<>();
		lst.add(new Employee("Nguyen Minh Anh", 20, 500000));
		lst.add(new Employee("Trinh Thang Binh", 21, 1000000));
		lst.add(new Employee("Tran Thuy Chi", 22, 2500000));
		lst.add(new Employee("Tran Van An", 20, 3500000));
		lst.add(new Employee("Hoang Bao Nam", 23, 4500000));
		lst.add(new Employee("Tran Minh Vuong", 25, 5500000));
		lst.add(new Employee("Tran Anh Quan", 28, 6500000));
		lst.add(new Employee("Vuong Anh Tu", 27, 7500000));
		lst.add(new Employee("Le Van Luyen", 26, 8500000));
		lst.add(new Employee("Nguyen Hoang Duy", 15, 9500000));
		lst.add(new Employee("Van Mai Huong", 18, 2000000));
		lst.add(new Employee("Phan Manh Quynh", 19, 3500000));
		lst.add(new Employee("Nguyen Dinh Vu", 30, 200000));
		lst.add(new Employee("Vo Van Nam", 18, 1000000));
		lst.add(new Employee("Tran Trung Duc", 22, 500000));
		return lst;
	}

	// count and show employees have salary > 3000000
	public static void showEmployeeWithSalary(List<Employee> lst) {
		// count amount employees has salary > 3000000
		int count = 0;
		count = (int) lst.stream()
				.filter(Employee -> Employee.getSalary() > 3000000).count();
		System.out.println("--> Employees has salary > 3000000: " + count);

		// list employee has salary > 3000000
		List<Employee> lstSalary = lst.stream()
				.filter(Employee -> Employee.getSalary() > 3000000)
				.collect(Collectors.toList());
		System.out.println("--> List employee have salary > 3000000:");
		for (Employee emp : lstSalary) {
			System.out.println(emp.toString());
		}
	}

	// find employees have "Anh" in name -> return list employee / null
	public static List<Employee> findEmployee(List<Employee> lst) {
		List<Employee> result = new ArrayList<>();
		result = lst.stream()
				.filter(Employee -> Employee.getName().contains("Anh"))
				.collect(Collectors.toList());
		return result;
	}

	// function calculate avg age of employee
	public static double calAvgAge(List<Employee> lst) {
		List<Integer> ages = new ArrayList<>();
		for (Employee emp : lst) {
			ages.add(emp.getAge());
		}

		IntSummaryStatistics stats = ages.stream().mapToInt((x) -> x)
				.summaryStatistics();
		return stats.getAverage();
	}

	// function statistics salary employee
	public static void statisticSalary(List<Employee> lst) {
		List<Double> salaries = new ArrayList<>();
		for (Employee emp : lst) {
			salaries.add(emp.getSalary());
		}

		DoubleSummaryStatistics stats = salaries.stream().mapToDouble((x) -> x).summaryStatistics();
		System.out.println("Max salary: " + stats.getMax());
		System.out.println("Min salary: " + stats.getMin());
		System.out.println("Avg salary: " + stats.getAverage());
	}
}
