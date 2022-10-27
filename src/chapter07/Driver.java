package chapter07;

public class Driver {
	private int balance;
	void drive(Vehicle vehicle) {// Vehicle vehicle = vehicle;
		vehicle.run();
		if (vehicle instanceof Taxi) {
			Taxi taxi = (Taxi) vehicle;
			int fee = taxi.fee();
			balance += fee;
		} else if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			int fee = bus.fee();
			balance += fee;
		} else {
			balance = 0;
		}
		System.out.println(balance);
	}
	
	int getBalance() {
		return balance;
	}
}
