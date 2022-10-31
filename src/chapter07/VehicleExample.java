package chapter07;

public class VehicleExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
//		Vehicle vehicle = new Taxi();
		Vehicle vehicle = new Bus();
		
		Bus bus = (Bus) vehicle;
		
		Vehicle v = new Vehicle();
		Bus b = (Bus) v;
		
		driver.drive(vehicle);
		driver.drive(vehicle);
		
	}
	
	
}
