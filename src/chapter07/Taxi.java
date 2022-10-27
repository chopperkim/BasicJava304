package chapter07;

public class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	public int fee() {
		return 3300;
	}
}
