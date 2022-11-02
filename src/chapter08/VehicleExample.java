package chapter08;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle = new Taxi();
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		Driver driver = new Driver();
		driver.drive(new Bus());
	}
}
