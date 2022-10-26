package chapter05.exercise;

public class Exercise51 {
	public static void main(String[] args) {
		/*
		 * 다음 배열에서 최댓값과 최솟값을 구하시오.
		 * {38, 94, 16, 3, 76, 94, 82, 47, 59, 8}
		 */
		int max = Integer.MIN_VALUE;// int 타입의 최솟값
		int min = Integer.MAX_VALUE;// int 타입의 최댓값
		int[] numberArray = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
//		int max = numberArray[0];
//		int min = numberArray[0];
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] > max) {
				max = numberArray[i];
			}
			if (min > numberArray[i]) {
				min = numberArray[i];
			}
		}
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}
}









