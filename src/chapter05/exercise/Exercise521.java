package chapter05.exercise;

import java.util.Random;

public class Exercise521 {
	public static void main(String[] args) {
		/*
		 * 로또 다른 방법
		 */
		int[] lottoNumber = new int[45];
		Random random = new Random();
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = i + 1;
		}
		
		for (int i = 0; i < lottoNumber.length; i++) {
			int temp = lottoNumber[i];
			int ranNum = random.nextInt(45);
			lottoNumber[i] = lottoNumber[ranNum];
			lottoNumber[ranNum] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(lottoNumber[i] + " ");
		}
	}
}







