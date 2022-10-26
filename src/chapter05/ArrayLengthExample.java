package chapter05;

public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87, 66, 13};
		int sum = 0;
		// 배열의 속성: length => 배열의 갯수
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
//		scores[5] = 100;
//		scores.length = 100;
	}
}
