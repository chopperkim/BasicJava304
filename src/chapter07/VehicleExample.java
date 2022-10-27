package chapter07;

public class VehicleExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
//		Vehicle vehicle = new Taxi();
		Vehicle vehicle = new Bus();
		
		driver.drive(vehicle);
		driver.drive(vehicle);
		
	}
	
	
}
