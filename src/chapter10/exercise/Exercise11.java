package chapter10.exercise;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		/*
		 * 두 개의 정수를 입력받아 나눗셈을 하는 프로그램을 만들어 보자.
		 * (나눗셈의 결과는 정수로 나타낸다.)
		 */
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("어떤 수를 나누시겠습니까?>>");
				int dividend = Integer.parseInt(scanner.nextLine());
				System.out.print("어떤 수로 나누시겠습니까?>>");
				int divisor = Integer.parseInt(scanner.nextLine());
				int quotient = dividend / divisor;
				System.out.println(dividend + " / " + divisor + " = " + quotient);
				break;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			} 
		}
		scanner.close();
	}
}
