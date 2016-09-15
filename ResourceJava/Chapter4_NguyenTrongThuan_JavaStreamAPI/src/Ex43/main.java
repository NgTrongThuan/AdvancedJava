package Ex43;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Nguyen Trong Thuan
 * date: 12/09/2016
 * @version : 1.0
 * --------------------------
 * create main method
 *
 */
public class main {

	public static void main(String[] args) {
		try{
			List<Student> list = Arrays.asList(new Student("An Le", 20, 8, 9),
					new Student("Binh Tran", 17, 8, 8),
					new Student("Chau Le", 23, 9, 9),
					new Student("Duong Le", 16, 7, 9),
					new Student("Giang Le", 22, 8, 9),
					new Student("Tran Huy", 20, 8, 5),
					new Student("Hong Nguyen", 15, 8, 10),
					new Student("Khanh Phuong", 23, 8, 9),
					new Student("Long Tran", 14, 5, 9),
					new Student("Le Truc", 26, 10, 9),
					new Student("Vy Phuong", 25, 8, 10));
			
			Stream<Student> stream = list.stream();
			stream.forEach(st -> st.showInfo());
			
			// count number of student have age >= 18
			int countAge = (int)list.stream().filter(st -> st.getAge() >= 18).count();
			System.out.println("Number of student have age >= 18: " + countAge);
			
			// count number of student have first name is H
			int countName = (int)list.stream().filter(st -> st.getName().startsWith("H")).count();
			System.out.println("Number of student have first name is H: " + countName);
			System.out.println("List student have first name is H: ");
			List<Student> lst = list.stream().filter(st -> st.getName().startsWith("H")).collect(Collectors.toList());
			lst.forEach(st -> st.showInfo());
			
			// find max, min and avg mark
			DoubleSummaryStatistics stats = list.stream().mapToDouble(s -> s.calAvg()).summaryStatistics();
			System.out.println("- Max avg mark: " + stats.getMax());
			System.out.println("- Min avg mark: " + stats.getMin());
			System.out.println("- Averange avg mark: " + stats.getAverage());
			
			// create list good student
			List<Student> goodSt = list.stream().filter(st -> st.calAvg() >= 8).collect(Collectors.toList());
			Stream<Student> goodStudent = goodSt.stream();
			System.out.println("List good student");
			goodStudent.forEach(st -> st.showInfo());
			
		}catch(NumberFormatException ex){
			System.out.println("Error: " + ex.getMessage());
		}

	}

}
