package chapter11;

public class StringExample {
	public static void main(String[] args) {
		System.out.println("홍길동".startsWith("길"));
		System.out.println("홍길동".startsWith("홍"));
		System.out.println("홍길동".endsWith("동"));
	//   0123456789
//		"abcd".substring(0,6);
		// 01[0-9]\-[0-9]{4}\-[0-9]{4}
		
		String concat = "a".concat("b");
		System.out.println(concat);
		String[] strings = "2022-11-04 11:45".split(" ");
		System.out.println(strings[0]);
		System.out.println(strings[1]);
		String[] strings2 = strings[0].split("-");
		System.out.println(strings2[0]);
		System.out.println(strings2[1]);
		System.out.println(strings2[2]);
		
		String string = String.join("-", strings2[0], strings2[1], strings2[2]);
		
		System.out.println(string);
		
		
	}
}
