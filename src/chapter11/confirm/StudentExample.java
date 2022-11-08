package chapter11.confirm;

import java.util.HashMap;
import java.util.Map;

public class StudentExample {
	public static void main(String[] args) {
		Map<Student,String> map = new HashMap<Student, String>();
		map.put(new Student("1"), "95");
		
		String score = map.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);
	}
}
