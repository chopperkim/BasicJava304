package chapter05;

import java.util.Scanner;

public class NullExample {
	public static void main(String[] args) {
		String str = "";
		System.out.println(str);
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		if (name.equals("java")) {
			str = scanner.nextLine();
		}
		if (str != null) {
			int length = str.length();
			System.out.println("파일 길이: " + length);
		}
	}
}
