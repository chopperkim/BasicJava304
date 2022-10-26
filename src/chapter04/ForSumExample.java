package chapter04;

import java.util.Scanner;

public class ForSumExample {
	public static void main(String[] args) {
		// 1부터 100까지의 합이 아닌
		// 1부터 입력된 숫자까지의 합을 구하는 프로그램을 작성하시오.
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
		
		int sum = 0;
		int i = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + (i - 1) + " 합: " + sum);
	}
}



