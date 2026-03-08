import java.util.Scanner;
public class Tspg {
public static void main (String [] args) {
Scanner x = new Scanner(System.in);
System.out.print("Full name: ");
String name = x.nextLine();
System.out.print("Department name: ");
String department = x.nextLine();
System.out.print("Birth year: ");
int year = x.nextInt();
System.out.print("Number of courses taken the semester: ");
int number = x.nextInt();
int age = 2026 - year;
int weekly = number * 3;
String upper = department.toUpperCase();
int length = name.length();
System.out.printf("----- STUDENT PROFILE -----%nName: %s%nName length: %d%nDepartment: %s%nAge %d%nCourses this semester: %d%nEstimated weekly study hours: %d%n------------------------------%n", name, length, upper, age, number, weekly); 


}
}
