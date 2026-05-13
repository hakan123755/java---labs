import java.util.Scanner;
public class CommaSeparatedNumbers {
	public static void main (String[] args ) {
Scanner scanner = new Scanner(System.in);
scanner.useDelimiter(",|\n");
System.out.print("Please enter five integers in a line separated by commas "); int integer1 = x.nextInt();
int integer2 = scanner.nextInt();
int integer3 = scanner.nextInt();
int integer4 = scanner.nextInt();
int integer5 = scanner.nextInt();
int sum = integer1 + integer2 + integer3 + integer4 + integer5;
double average = (integer1 + integer2 + integer3 + integer4 + integer5) /5.0;
int weightedSum = 1 * integer1 + 2 * integer2 + 3 * integer3 + 4 * integer4 + 5 * integer5;
double weightedAverage = weightedSum / 15.0;
System.out.printf("For the input numbers, sum is %d, average is %.1f, weighted sum is %d and weighted average is %.1f.%n", sum, average, weightedSum, weightedAverage); 



}
}
