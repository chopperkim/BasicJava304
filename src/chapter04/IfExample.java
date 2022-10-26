package chapter04;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
	}
}



