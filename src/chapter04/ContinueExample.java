package chapter04;

public class ContinueExample {
	public static void main(String[] args) {
		// 1부터 10까지의 짝수를 출력하시오.

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
