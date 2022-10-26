package chapter06;

public class Student {
	String name;
	String no;
	Book book;
	static String checkoutTime;
	static long balance;
	public Student() {
		name = "홍길동";
		checkoutTime = "17:50";
		book = new Book();
		book.title = "혼공자바";
	}
}

class Book {
	String title;
}
