package Exercise10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Trong Thuan
 * @date: 21/08/2016
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /**
     * function choice
     * output: return y if continue else return n
     */
    
    public static String choice() throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Do you want to continue (y/n) ?");
        String choice = input.readLine();
        if(!choice.equals("y") && !choice.equals("n")){
            throw new ArithmeticException("Choice value is not valid!");
        }
        return choice;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            ArrayList<Teacher> arrTeacher = new ArrayList<Teacher>();
            ArrayList<Student> arrStudent = new ArrayList<Student>();
            String choice = "y";
            while (choice.equals("y")) {
                System.out.println("-----------------------------------------");
                System.out.print("Input name: ");
                String name = input.readLine();
                System.out.print("Input day of birth: ");
                String birth = input.readLine();
                System.out.print("Input address: ");
                String address = input.readLine();
                System.out.print("Input phone number: ");
                String phone = input.readLine();
                System.out.println("-----------------------------------------");
                System.out.println("Option: ");
                System.out.println("Press 1: Add Teacher");
                System.out.println("Press 2: Add Student");
                int option = Integer.parseInt(input.readLine());
                if (option != 1 && option != 2) {
                    throw new ArithmeticException("Option value is not valid!");
                }
                System.out.println("-----------------------------------------");
                if(option == 1){
                    System.out.print("Input class managed: ");
                    String classManager = input.readLine();
                    System.out.print("Input rate of salary: ");
                    double rateSalary = Double.parseDouble(input.readLine());
                    System.out.print("Input subvention: ");
                    double sudvention = Double.parseDouble(input.readLine());
                    arrTeacher.add(new Teacher(classManager, rateSalary, sudvention, name, birth, address, phone));
                    choice = choice();
                }else{
                    System.out.print("Input class: ");
                    String studentOfClass = input.readLine();
                    System.out.print("Input score Semester 1: ");
                    double scoreSemester1 = Double.parseDouble(input.readLine());
                    System.out.print("Input score Semester 2: ");
                    double scoreSemester2 = Double.parseDouble(input.readLine());
                    arrStudent.add(new Student(studentOfClass, scoreSemester1, scoreSemester2, name, birth, address, phone));
                    choice = choice();
                }
            }
            System.out.println("-----------------------------------------");
            System.out.println("List teacher: ");
            for(Teacher teacher : arrTeacher){
                teacher.showInformation();
            }
            System.out.println("-----------------------------------------");
            System.out.println("List student: ");
            for(Student student : arrStudent){
                student.showInformation();
            }
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
