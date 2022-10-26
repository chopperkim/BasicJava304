package chapter06;

public class Person {
	// 변수명, 메소드명: camelcase
	// 클래스명: pascalcase
	// 상수명: underscore => snake case
	// v_number, f_go(): 헝가리안 표기법
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person() {
	}
	
	void run() {
		name = "홍길동";
		System.out.println(name);
		return;
	}
}

