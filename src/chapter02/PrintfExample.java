package chapter02;

public class PrintfExample {
	public static void main(String[] args) {
		// 출력(output)
		System.out.printf("%02d:%02d\n", 9, 5);
		System.out.printf("%,d\n", 1000000);
		String ht = String.format("%,d", 1000000);
		System.out.println(ht);
	}
}
