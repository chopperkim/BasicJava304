package chapter06;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		instance1.setName("홍길동");
		System.out.println(instance2.getName());
		System.out.println(instance1 == instance2);

	}
}
