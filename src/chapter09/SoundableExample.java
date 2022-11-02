package chapter09;

public class SoundableExample {
	public static void main(String[] args) {
//		printSound(new Dog());
//		printSound(new Cat());
		// 1회용 객체
		printSound(() -> System.out.println("어흥"));
	}
	
	public static void printSound(Soundable soundable) {
		soundable.sound();
	}
}
