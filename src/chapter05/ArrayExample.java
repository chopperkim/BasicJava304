package chapter05;

import java.util.Arrays;
import java.util.Currency;
import java.util.Random;

public class ArrayExample {
	public static void main(String[] args) {
		/*
		 * 배열(Array) => Collection Framework(13장)을 많이 사용
		 * 참조 타입
		 * []: 인덱싱, 배열 만들때, 선언할 때
		 * 1차 배열 확장 => 2차, 3차(X)
		 */
		// new 할때 ()괄호를 붙이는 경우, 안붙이는 경우
		String[] name = new String[25];
		// index는 0부터 시작
		name[0] = "권나영";
		name[1] = "김성준";
		name[2] = "김용익";
		for (int i = 0; i < 25; i++) {
			System.out.println(name[i]);
		}
		char c = '\u0000';
		String s = "";
		//Random 클래스 15개를 배열로 만든다
		Random[] random1 = new Random[15];
		random1[0] = new Random();
		random1[1] = new Random();
		// => 
		Random[] random3 = {new Random(), new Random(), };
		
		Random random2 = new Random();
		random2.nextInt(10);
		random2.nextDouble();
		
		int ranNum = random1[0].nextInt(10);
		double ranDouble = random1[1].nextDouble();
		
		
		// boolean 타입 데이터 25개를 배열로 만든다.
		boolean[] flags = new boolean[25];
		flags[0] = false;	// flags1 = false
		flags[1] = true;	// flags2 = true;
		
		// 리터럴 형식으로 표현 중괄호를 쓴다.
//		nums = [1, 2, 3, ] 대부분의 언어
		int a = 1;
		int[] nums = {1, 2, 3, };// {} 배열 리터럴
		Currency[] cArr = new Currency[10];
		cArr[0] = Currency.getInstance("ko-kr");
		Arrays[] myArrays = new Arrays[5];
		
	}
}





