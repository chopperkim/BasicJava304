package chapter06;

public class MethodExampleClass {
	double divide(int x, int y) { // int x = 10, y = 20;
		double result = (double) x / y;
		return result;
	}
	/*
	 * jdk 1.5 부터 가변인수(Variable Arguments) 개념 도입
	 */
	void run(int... nums) {
		double divide = divide(10, 20);
		System.out.println(divide);
	}
}
