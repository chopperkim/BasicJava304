package chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("java");
		set.add("Java");
		set.add("JAVA");
		set.add("myBatis");
		set.add("iBatis");
		set.add("JDBC");
		set.add("jdbc");
		set.add("Jdbc");
		set.add("JDBC");
		System.out.println("집합의 갯수: " + set.size());
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
		set.remove("Jdbc");
		System.out.println();
		// 향상된 for문 foreach문 (jdk 1.5)
		for (String string : set) {
			System.out.println(string);
		}
		
	}
}




