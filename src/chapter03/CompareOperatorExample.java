package chapter03;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		int z = (num1 += 1) + (num2 -= 1);
		boolean result1 = num1 == num2;
		boolean result2 = num1 != num2;
		boolean result3 = num1 <= num2;
		char char1 = 'b'; // 98
		char char2 = 'B'; // 66
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == (double) v5);
		boolean result4 = char1 < char2;
		
		
	}
}
