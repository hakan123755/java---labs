public class TemperatureSensor{
public String location;
public boolean isActive;
public double temperature;
public void activate(){
isActive = true;
System.out.println("Sensor in " + location + " is now ACTIVE.");}
public void deactivate(){
isActive = false;
System.out.println("Sensor in " + location + " is now OFF.");}
public void updateTemperature(double newTemp){
if(!isActive){
System.out.println("The sensor is OFF. Temperature cannot be updated.");}
else{
System.out.println("The temperature in " + location + " updated to " + newTemp + ".");}}
public void displayInfo(){
if(isActive){
System.out.printf("Location: %s | Temperature: %.1f | Status: ACTIVE%n", location, temperature);}
else{
System.out.printf("Location: %s | Temperature: %.1f | Status: OFF%n", location, temperature);}}




}
