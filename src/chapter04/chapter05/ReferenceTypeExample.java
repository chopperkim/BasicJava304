package chapter04.chapter05;

import java.util.Scanner;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String c = "홍길동";
		
		String name = null;
		Scanner scanner = new Scanner(System.in);
		if (a != 10) {
			name = scanner.nextLine();
		}
		System.out.println(name);
	}
}
