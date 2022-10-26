package chapter05.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		/*
		 * 로또번호를 생성하는 프로그램을 작성하시오.
		 * (로또 번호는 1 ~ 45번까지 있으며
		 * 이 중에서 중복되지 않는 6개의 숫자를 추출하여
		 * 결과를 출력한다.)
		 */
		// 1 ~ 45 사이의 랜덤 숫자 6개를 배열에 저장
		int[] lotto = new int[6];
		Random random = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println(lotto[i]);
//		}
	}
}





