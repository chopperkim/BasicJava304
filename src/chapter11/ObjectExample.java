package chapter11;

import chapter06.Member;

public class ObjectExample {
	public static void main(StringExample[] args) {
		Member member = new Member("a", "b", "c", 100);
		System.out.println(member);
		
		/*
		 * toString(), hashCode(), equals()는 필드를 갖는 클래스라면
		 * 반드시 재정의 해주는 것이 좋다.
		 * 그런데 위 내용을 매번 작성하기 귀찮다.
		 * 그래서 나온 솔루션이 Lombok이다.
		 */
	}
}
