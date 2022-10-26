package chapter06;

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Member() {
		this(null, null, null, 0);
	}
	// 매개 변수: parameter(파라미터)
	public Member(String name) {// String name = "홍길동";
		this(name, null, null, 0);
	}
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Member(String name, int age) {
		this(name, null, null, age);
	}
	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
		System.out.println("Member 클래스 생성됨");
	}
}
