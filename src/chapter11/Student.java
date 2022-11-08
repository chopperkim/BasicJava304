package chapter11;

/*
 * java와 같은 jvm 위에서 동작하는 언어 => kotlin
 * 
 */
public class Student {
	private StringExample name;
	private int studentNo;
	@Override
	public String toString() {
		return String.format("Student [name=%s, studentNo=%s]", name, studentNo);
	}
	
}
