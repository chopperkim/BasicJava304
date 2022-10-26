package chapter04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		/*
		 * 컴퓨터가 1부터 100 사이의 임의의 정수를 생성하면,
		 * 그 수를 맞추는 게임을 만들어보자.
		 * 사용자가 추측한 수를 입력하면,
		 * 컴퓨터가 생성한 수보다 큰지 작은지를 알려준다.
		 * 사용자가 추측한 수가 컴퓨터가 생성한 수와 같을 때까지 반복한다.
		 * 1부터 100까지의 랜덤 숫자는
		 * new Random().nextInt(100) + 1로 구할 수 있다.
		 */
		Scanner scanner = new Scanner(System.in);
		int ranNum = new Random().nextInt(100) + 1;
		int count = 0;
		while (true) {
			count++;
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int inputNum = Integer.parseInt(scanner.nextLine());
			
			if (ranNum == inputNum) {
				System.out.println("정답입니다.");
				break;
			} else if (ranNum > inputNum) {
				System.out.println("정답은 더 큰 수 입니다.");
			} else {
				System.out.println("정답은 더 작은 수 입니다.");
			}
		}
		System.out.println(count + "만에 맞추셨습니다.");
		System.out.println("게임을 종료합니다.");
		scanner.close();
	}
}
