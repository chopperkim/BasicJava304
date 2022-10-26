package chapter04;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// Random 사용하기(Pseudo Random: 수도 랜덤)
		// 1. 책(p.139 ~ p.140)에 있는 내용은 공식을 외워야 함
		// int num = (int) (Math.random() * 6) + 1;
		// 2. Random 객체를 이용해서 만들기
		// 3. 보안: SecureRandom을 사용
		Random random = new Random(11);
		// 8 ~ 11사이의 정수
		int time = random.nextInt(4) + 8;
//		random.nextInt(6); // 0부터 5까지
//		random.nextInt(7);// 0부터 6까지
		int num1 = random.nextInt(6) + 1;
		int num2 = random.nextInt(6) + 1;
		int num3 = random.nextInt(6) + 1;
		int num4 = random.nextInt(6) + 1;
		int num5 = random.nextInt(6) + 1;
		int num6 = random.nextInt(6) + 1;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
	}
}
