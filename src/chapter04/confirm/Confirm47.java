package chapter04.confirm;

import java.util.Scanner;

public class Confirm47 {
	public static void main(String[] args) {
		boolean run = true;
		// 잔액
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			int menu = Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1:
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.println("잔고> " + balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
