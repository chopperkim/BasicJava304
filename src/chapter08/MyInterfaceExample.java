package chapter08;

public class MyInterfaceExample {
	public static void main(String[] args) {
		
		new MyInterface2();
		
		new MyInterface() {
			@Override
			public void turnOn() {
			}
			@Override
			public void turnOff() {
			}
		};
		
		
		
		MyInterface myInterface = new MyClass1();
		
		myInterface.turnOn();
		myInterface.turnOff();
		
		myInterface = new MyClass3();
		myInterface.turnOn();
		myInterface.turnOff();
	}
}




