package chapter13;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
//		map = new Hashtable<>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		Integer hongValue = map.get("홍길동");
		System.out.println(hongValue);
		
		System.out.println(map);
		
		// Entry를 활용
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		Map<String, Object> memberMap = new HashMap<>();
		memberMap.put("MEM_ID", "a001");
		memberMap.put("MEM_PASS", "asdfasdf");
		memberMap.put("MEM_NAME", "김은대");
		
		Map<Cart, Object> cartMap = new HashMap<>();
		
	}
}








