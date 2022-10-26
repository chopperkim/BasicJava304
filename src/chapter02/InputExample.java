package chapter02;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		// 입력(Input)
		// System.in.read(); 한글자씩 입력받는다.
		// Scanner라는 클래스를 이용
		// => 데이터를 입력받아 원하는 타입으로 받아준다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = scanner.nextLine();// 문자열로 반환
		System.out.print("나이를 입력하세요: ");
		int age = scanner.nextInt();
		
		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "입니다.");
	}
}
