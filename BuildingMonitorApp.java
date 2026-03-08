public class BuildingMonitorApp{
public static void main(String[] args){
TemperatureSensor sensor1 = new TemperatureSensor();
TemperatureSensor sensor2 = new TemperatureSensor();
sensor1.location = "Server Room";
sensor1.temperature = 22.0;
sensor1.isActive = false;
sensor2.location = "Office";
sensor2.temperature = 21.5;
sensor2.isActive = false;
sensor1.displayInfo();
sensor2.displayInfo();
sensor1.activate();
sensor2.activate();
sensor1.updateTemperature(25.5);
sensor2.updateTemperature(23.0);
sensor1.displayInfo();
sensor2.displayInfo();
sensor2.deactivate();
sensor2.updateTemperature(26.0);









}
}
