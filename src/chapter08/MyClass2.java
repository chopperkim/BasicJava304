package chapter08;

public class MyClass2 implements MyInterface {
	@Override
	public void turnOn() {
		System.out.println("Class2 켜짐");
	}
	@Override
	public void turnOff() {
		System.out.println("Class2 꺼짐");
	}
}
