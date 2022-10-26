package chapter03.confirm;

import java.util.Scanner;

public class Confirm39 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		double firstNumber = scanner.nextDouble();
		System.out.print("두 번째 수: ");
		double secondNumber = scanner.nextDouble();
		System.out.println("------------------------");
//		double result = firstNumber / secondNumber;
		String result = secondNumber == 0 || secondNumber == 0.0 ?
				"무한대" : String.valueOf(firstNumber / secondNumber);
		System.out.println("결과: " + result);
	}
}
