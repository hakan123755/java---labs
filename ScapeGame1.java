import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ScapeGame1 {
public static void main(String[] args) {
int total = 0;
int lineCount = 0;
int multiply = 0;
int number = 0;
try{
Scanner xx = new Scanner(new File("keycard.txt"));
while(xx.hasNextLine()){
lineCount++;
String line = xx.nextLine();
System.out.println("Processing line " + lineCount + "...");
if(line.contains("GRANTED")){
System.out.println("Access GRANTED detected.");
int dash = line.indexOf("-");
String dashIndex = line.substring(dash + 1);
number = Integer.parseInt(dashIndex);
System.out.println("Extracted number: " + number);
total += number;
multiply = total * 3;
}else{
System.out.println("Access denied. Skipping.");
}
}
xx.close();
System.out.printf("Sum of extracted numbers: %d%nFinal Door Code: %d%n%n%nThe vault door opens...%nYou escaped the facility!",total, multiply);
}catch(FileNotFoundException e){
System.out.println(e.getMessage());
}




}
}
