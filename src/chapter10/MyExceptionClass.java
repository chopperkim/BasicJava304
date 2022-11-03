package chapter10;

public class MyExceptionClass {
	public void run(String name) throws Exception {
		if (name == null) {
			throw new MyException();
		}
	}
}
