package chapter03.confirm;

import java.util.Scanner;

public class Confirm311 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디: ");
		String name = scanner.nextLine();
		System.out.print("패스워드: ");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
//		name.equals("java");(O)=> 가능하면 아래 방식으로
		if ("java".equals(name)) {// name == "java"(X)
			if (password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패: 아이디 존재하지 않음");
		}
	}
}
