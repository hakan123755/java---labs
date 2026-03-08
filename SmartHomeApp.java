import java.util.Scanner;
public class SmartHomeApp{
public static void main(String[] args){
Scanner x = new Scanner(System.in);
SmartLight light = new SmartLight();
light.location = "Living Room";
light.brightness = 50;
light.turnOn();
int brightness;
do{
System.out.println("Enter brightness change value (-50 to 50): ");
brightness = x.nextInt();
if(brightness < -50 || brightness > 50){
System.out.println("Invalid value. Please enter a number between -50 and 50");}}
while(brightness < -50 || brightness > 50);
System.out.println("Brightness level: " + light.adjustBrightness(brightness));
light.turnOff();









}
}
