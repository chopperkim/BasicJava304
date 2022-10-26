package chapter02.exercise;

import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
		double radius = scanner.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		double height = scanner.nextDouble();
		// 처리
		double area = Math.PI * radius * radius;
		double volume = area * height;
		System.out.println("넓이는: " + area + ", 부피는 " + volume);
		scanner.close();
	}
}
