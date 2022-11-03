package chapter10;

public class ThrowsExample {
	public static void main(String[] args) {
		/*
		 * (method) throws: 메소드 호출한 위치로 예외를 떠넘긴다.
		 * (I) throw: 개발자가 직접 예외를 발생시킨다.
		 * => 일반예외에 작성되어 있음
		 */
		try {
			method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void method2() throws Exception {
		method1();
	}
	
	private static void method1() throws Exception {
		Class.forName("java.lang.String");
	}
}











