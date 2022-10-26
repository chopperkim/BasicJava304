package chapter06;

import java.util.Arrays;

public class StaticRunExample {
	public static void main(String[] args) {
		StaticExample.main(args);
		run();
	}
	
	static void run() {
		main(null);
		System.out.println("run 메소드 실행");
	}
}
