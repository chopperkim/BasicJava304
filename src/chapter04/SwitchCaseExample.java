package chapter04;

public class SwitchCaseExample {
	public static void main(String[] args) {
		/*
		 * switch case 제약사항
		 * switch (): 괄호 안에 들어갈 수 없는 타입
		 * boolean, float, double
		 * byte, short, char, int, long, String(jdk1.5)
		 */
		byte a = 1;
		switch (a) {
		case 1:
			
			break;
		case 2:
			
			break;

		default:
			break;
		}
	}
}
