package chapter09;

public class GreetingableExample {
	public static void main(String[] args) {
//		Greetingable g = new Greetingable() {
//			@Override
//			public String morning(String name) {
//				return name + "님, 안녕하세요!";
//			}
//		};
		Greetingable g = name -> name + "님, 안녕하세요!";
		System.out.println(g.morning("홍길동"));
		System.out.println(g.morning("류관순"));
		System.out.println(g.morning("신용권"));
		
		String greetingStr = new Greetingable() {
			@Override
			public String morning(String name) {
				return name + "님, 안녕하세요!";
			}
		}.morning("이순신");
		System.out.println(greetingStr);
		
	}
}






