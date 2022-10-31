package chapter07;

public class PhoneExample {
	public static void main(String[] args) {
		CellPhone phone = new CellPhone("홍길동") {
			@Override
			public void turnOn() {
			}
			@Override
			public void turnOff() {
			}
		};
		phone.turnOn();
	
	}
}
