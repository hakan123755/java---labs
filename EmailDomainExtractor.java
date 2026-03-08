import java.util.Scanner;
public class  EmailDomainExtractor {
	public static void main (String[] args ) {
Scanner x = new Scanner(System.in);
System.out.print("Please enter your email address in lover case ");
String fullEmail = x.nextLine();
//Find the location
int location = fullEmail.indexOf('@');
String domain = fullEmail.substring(location + 1);
//This is the first character of domain
char firstChar = domain.charAt(0);
int domainLength = domain.length();
char lastChar = domain.charAt(domainLength -1);
System.out.printf("Domain: %s %nLength: %d %nFirst character: %c %nLast character: %c %n", domain, domainLength, firstChar, lastChar);


}
}
