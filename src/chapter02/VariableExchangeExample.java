package chapter02;

public class VariableExchangeExample {
	public static void main(String[] args) {
		String str = "홍/*길*/동";
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y);
	}
}
