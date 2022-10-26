package chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int i = 500;
		byte b = (byte) i;
		System.out.println(b);
		
		double d = 3.14;
		int intValue = (int) d;
		System.out.println(intValue);
		
		int x = 10;
		int y = 3;
		double result = x / y;
		System.out.println(result);
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2);
		int intValue2 = b1 + b2;
		
		float f1 = 3.14f;
		double f2 = 3.15f;
		
		double f3 = f1 + f2;
		int a = 100;
		String str = a + "";
		String str2 = "100";
		String str3 = "10e4";
		System.out.println(Integer.parseInt(str2));
		System.out.println(Double.parseDouble(str3));
		
		double pi = 3.14;
		String piStr = pi + "";
		String piStr2 = String.valueOf(pi);
		System.out.println(piStr2);
		
		char c1 = 'a';
		char c2 = (char) (c1 + 1);
		System.out.println(c2);
	}
}





