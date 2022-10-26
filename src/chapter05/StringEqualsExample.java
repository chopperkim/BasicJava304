package chapter05;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		System.out.println(strVar1 == strVar2);
		System.out.println("신민철".equals("신민철"));
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		System.out.println(strVar3 == strVar4);
		System.out.println(strVar3.equals(strVar4));
		
	}
}
