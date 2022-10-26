package chapter02.confirm;

import java.util.Scanner;

public class Confirm243 {
	public static void main(String[] args) {
		/*
		 * [입력한 내용]
		 * 홍길동
		 * 123456
		 * 010-123-1234
		 */
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String regNo = scanner.nextLine();
		System.out.print("3. 전화번호: ");
		String tel = scanner.nextLine();
		// 처리
		// 출력
		System.out.println("\n[입력한 내용]");
		System.out.println(name);
		System.out.println(regNo);
		System.out.println(tel);
	}
}
