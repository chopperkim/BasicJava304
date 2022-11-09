package chapter13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {
	public static void main(String[] args) {
		// 자동 타입 추론 type inference
		// 생성시 타입 생략은 jdk 1.7부터 가능
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("Java");
		list.add("Servlet/JSP");
		list.add("JDBC");
		list.add(2, "Database");
		list.add("myBatis");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(1);
		list.remove(3);
		System.out.println();
		for (String string : list) {
			System.out.println(string);
		}
		
		list.clear(); // 모두 삭제
		System.out.println("총 갯수: " + list.size());
		
//		String[] strArray = new String[4];
//		strArray[0] = "홍길동";
//		strArray[1] = "Java";
//		strArray[2] = "Servlet/JSP";
//		strArray[3] = "JDBC";
	}
}
