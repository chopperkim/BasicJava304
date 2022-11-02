package chapter07.exercise;

import java.util.Arrays;

public class HumanExample {
	public static void main(String[] args) {
		Human[] humans = new Human[3];
		humans[0] = new Human("홍길동", 30);
		humans[1] = new Human("이순신", 25);
		humans[2] = new Human("류관순", 16);
		for (Human human : humans) {
			System.out.println(human);
		}
		Arrays.sort(humans);
		System.out.println("이름 순으로 정렬 후");
		for (Human human : humans) {
			System.out.println(human);
		}
		
		
	}
}
