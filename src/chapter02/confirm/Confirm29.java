package chapter02.confirm;

public class Confirm29 {
	public static void main(String[] args) {
		long var1 = 2;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int) (var1 + var2 + var3 + (int) Double.parseDouble(var4));// 6.2999999523162843.9
		System.out.println(result);
		
		System.out.print("");
		System.out.println("");
		System.out.printf("");// format(형식)
		
	}
}
