public class SmartLight{
public String location;
public boolean isOn;
public int brightness;
public void turnOn(){
isOn = true;
System.out.println("Turning on the light...");
System.out.println("Light is ON");}
public void turnOff(){
isOn = false;
System.out.printf("Turning off the light...%nLight is OFF%n");}
public int adjustBrightness(int brightness){
return 50 + brightness;}










}
