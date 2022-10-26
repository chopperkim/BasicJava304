package chapter05;

import java.util.Arrays;
import java.util.function.Consumer;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores0;
		int[] scores1 = {95, 71, 84, 93, 87};
		int[] scores2 = {95, 71, 84, 93, 87};
		System.out.println(scores1 == scores2);
		int sum = 0;
		// ~~~~삼 ~~~~~셈
		// 1. 기본 반복문
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
		// 2. 향상된 반복문
		// 향상된 for문 (Advanced for Loop): foreach
		// there is something in everything.
//		for (int score : scores) {
//			sum += score;
//		}
		// 3. forEach라는 메소드를 이용
		// jdk 1.8에 stream + lambda를 이용해서 함수형 프로그래밍 구현
		
//		System.out.println(sum);
//		double avg = (double) sum / scores.length;
//		System.out.println(avg);
		
	}
}
