package chapter04.exercise;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		/*
		 * 두 사람이 하는 가위 바위 보 게임을 만들어 보자.
		 * 두 사람이 입력한 문자열을 비교하여 누가 이겼는지
		 * 출력하는 프로그램이다.
		 * 문자열을 읽기 위해서는 Scanner 클래스의 next() 메소드를
		 * 이용하면 된다.
		 * 또 자바에서 문자열 비교는 주의를 기울여야 한다.
		 * String 타입 변수와 문자열 비교는 == 이 아닌
		 * equals() 메소드로 비교하여야 한다.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		String cheolsu = scanner.nextLine();
		System.out.print("영희: ");
		String younghee = scanner.nextLine();
		// 조건문은 결과를 먼저 생각
		String result = "";
		if (cheolsu.equals(younghee)) {
			result = "비김!";
		} else if (cheolsu.equals("가위") && younghee.equals("바위")
				|| cheolsu.equals("바위") && younghee.equals("보")
				|| cheolsu.equals("보") && younghee.equals("가위")) {
			result = "영희 승리!";
		} else {
			result = "철수 승리!";
		}
		System.out.println("결과: " + result);
		
		scanner.close();
	}
}







