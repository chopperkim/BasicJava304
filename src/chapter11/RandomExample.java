package chapter11;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		int ranNum = (int) (Math.random() * 10) + 1;
		Random random = new Random();
		int ranNum2 = random.nextInt(10) + 1; // 1부터 10까지
		Student student = new Student();
		System.out.println(student);
	}
}
