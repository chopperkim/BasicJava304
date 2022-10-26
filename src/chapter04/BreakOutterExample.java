package chapter04;

public class BreakOutterExample {
	public static void main(String[] args) {
//		Random random = new Random();
//		while (true) {
//			int num = random.nextInt(6) + 1;
//			System.out.println(num);
//			if (num == 6) {
//				break;
//			}
//		}
		// for or while and switch 
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			System.out.print(upper + "-");
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.print(lower + " ");
				if (lower == 'g') {
					break;
				}
			}
			System.out.println();
		}
		System.out.println("프로그램 실행 종료");
	}
}
