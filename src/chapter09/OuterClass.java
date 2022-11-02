package chapter09;

public class OuterClass {
	String name = "outer class";
	class InnerClass {
		String name = "inner class";
	}
	
	static class StaticInnerClass {
		int age = 10;
	}
	void methodA() {
		int age = 100;
		
		class LocalClass {
			int age = 20;
		}
		LocalClass localClass = new LocalClass();
		System.out.println("local class age: " + localClass.age);
	}
}
