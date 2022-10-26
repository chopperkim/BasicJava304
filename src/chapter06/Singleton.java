package chapter06;

public class Singleton {
	private String name;
	
	private static Singleton instance = new Singleton();
	private Singleton() {
	}
	public static Singleton getInstance() {
		return instance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
