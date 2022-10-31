package chapter08;

public class MyInterfaceExample {
	public static void main(String[] args) {
		MyInterface myInterface = new MyClass1();
		
		myInterface.turnOn();
		myInterface.turnOff();
		
		myInterface = new MyClass3();
		myInterface.turnOn();
		myInterface.turnOff();
	}
}




