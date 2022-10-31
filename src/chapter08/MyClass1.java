package chapter08;

public class MyClass1 implements MyInterface {
	@Override
	public void turnOn() {
		System.out.println("Class1 켜짐");
	}
	@Override
	public void turnOff() {
		System.out.println("Class1 꺼짐");
	}
}
