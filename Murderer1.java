import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Murderer1 {
public static void main (String[] args) {
Scanner x = new Scanner(System.in);
System.out.print("Choose suspect(CHEF/DRIVER/NEIGHBOR): ");
String chosenSuspect = x.nextLine().toUpperCase();
switch(chosenSuspect){
case "CHEF": System.out.println("Your chose is: CHEF");
break;
case "DRIVER": System.out.println("Your chose is: DRIVER");
break;
case "NEIGHBOR": System.out.println("Your chose is: NEIGHBOR");
break;
default: System.out.println("Invalid suspect. Case closed.");
return;
}
System.out.print("Ask ONE question(ALIBI/WHERE/MOTIVE/ITEM): ");
String chosenQuestion = x.nextLine().toLowerCase();
String line1 = "";
String line2 = "";
String line3 = "";
String line4 = "";
try {
Scanner xx = new Scanner(new File("evidence.txt"));
line1 = xx.nextLine();
line2 = xx.nextLine();
line3 = xx.nextLine();
line4 = xx.nextLine();
xx.close();
}catch(FileNotFoundException e) {
System.out.println("File not found" + e.getMessage());
return;
}
switch(chosenSuspect) {
case "CHEF":
switch(chosenQuestion) {
case "alibi": System.out.println("CHEF's alibi time: " + line1.substring(11,16));
break;
case "where": System.out.println("CHEF was at: " + line1.substring(23,30));
break;
case "motive": System.out.println("CHEF's motive: " + line1.substring(49));
break;
case "item": System.out.println("Suspicious item linked to CHEF: " + line1.substring(36,41));
break;
default: System.out.println("Invalid question! You wasted your chance.");
return;
}
break;
case "DRIVER": 
switch(chosenQuestion) {
case "alibi": System.out.println("DRIVER's alibi time: " +  line2.substring(13,18));
break;
case "where": System.out.println("DRIVER was at: " + line2.substring( 25,31));
break;
case "motive": System.out.println("DRIVER's motive: " + line2.substring(49));
break;
case "item": System.out.println("Suspicious item linked to DRIVER: " + line2.substring(37,41));
break;
default: System.out.println("Invalid question! You wasted your chance.");
return;
}
break;
case "NEIGHBOR": 
switch(chosenQuestion) {
case "alibi": System.out.println("NEIGHBOR's alibi time: " + line3.substring(15,20));
break;
case "where": System.out.println("NEIGHBOR was at: " + line3.substring(27,33));
break;
case "motive": System.out.println("NEIGHBOR's motive: " + line3.substring(53));
break;
case "item": System.out.println("Suspicious item linked to NEIGHBOR: " + line3.substring(39,45));
break;
default: System.out.println("Invalid question! You wasted your chance.");
return;
}
break;
}
String culprit = line4.substring(8);
System.out.print("FINAL MOVE: Who did it? (CHEF/DRIVER/NEIGHBOR): ");
String finalSuspect = x.nextLine().toLowerCase();
if(finalSuspect.equals(culprit)) {
System.out.println("Correct! The culprit was DRIVER. Case closed.");
}else{
System.out.println("Oops! You quessed it wrong. Cold case!");
}





}
}
