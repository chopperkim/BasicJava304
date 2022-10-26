package chapter05.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		Exercise53 exercise53 = new Exercise53();
		exercise53.game();
	}
	
	public void game() {
		/*
		 * 인공지능 컴퓨터와 게이머(사람)가
		 * 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위 바위 보를 입력하세요: ");
		String player = scanner.nextLine();
		Random random = new Random();
		String[] comArr = {"가위", "바위", "보"};
		String computer = comArr[random.nextInt(3)];
		
		// 조건문은 결과를 먼저 생각
		String result = "";
		if (player.equals(computer)) {
			result = "비김!";
		} else if (player.equals("가위") && computer.equals("바위")
				|| player.equals("바위") && computer.equals("보")
				|| player.equals("보") && computer.equals("가위")) {
			result = "컴퓨터 승리!";
		} else {
			result = "플레이어 승리!";
		}
		System.out.println("플레이어: " + player);
		System.out.println("컴퓨터: " + computer);
		System.out.println("결과: " + result);
		
		scanner.close();

	}
}
