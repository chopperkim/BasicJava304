package chapter06;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member();
		member.setName("최하얀");
		member.setAge(23);
		Member member1 = new Member();
		member1.setName("이순신");
		member1.setAge(20);
		
		Member member2 = new Member("홍길동");
		System.out.println(member2.getName());
		System.out.println(member2.getAge());
		new Member();
		// 인수 또는 인자: Argument
		new Member("홍길동");
		new Member("홍길동", 20);
		
//		Member member3 = new Member("신용권");
		
		
	}
}






