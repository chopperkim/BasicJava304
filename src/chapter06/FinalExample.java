package chapter06;

import chapter05.A;

public class FinalExample {
	static final int value = 10;
	
	public FinalExample() {
	}
	
	public static void main(String[] args) {
		final int a = 10;
		System.out.println(FinalExample.value);
		new A();
	}
}
