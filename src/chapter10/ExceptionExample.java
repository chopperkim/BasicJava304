package chapter10;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			Class.forName("java.1ang.String");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("패키지명이나 클래스명이 잘못되었습니다.");
		}
	}
}
