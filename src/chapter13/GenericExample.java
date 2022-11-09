package chapter13;

public class GenericExample {
	public static void main(String[] args) {
		// Generic (제네릭 or 지네릭)
		// => 타입 안정성 및 가독성 향상(강제 캐스팅이 없으니까)
		Box<Integer> box = new Box<Integer>(10);
		System.out.println(box.getValue());
		Box<String> box2 = new Box<String>("홍길동");
		System.out.println(box2.getValue());
		
		int result = box.getValue() + 100;
		System.out.println(result);
	}
}



