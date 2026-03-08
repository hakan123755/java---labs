public class Scp {
	public static void main (String [] args) {
double monthlySalary = 18000.00;
double yearlySalary = monthlySalary * 12;
double monthlyTax = monthlySalary * 0.20;
double remainingSalary = monthlySalary - monthlyTax;
System.out.printf("Nick earns $%.2f every month.%nHe has to pay $%.2f monthly tax.%nHis salary after tax is $%.2f.%nNick earns $%.2f every year.%n", monthlySalary, monthlyTax, remainingSalary, yearlySalary);

}
}
