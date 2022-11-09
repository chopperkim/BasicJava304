package chapter13.confirm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		Set<Entry<String,Integer>> set = map.entrySet();
//		for (Entry<String, Integer> entry : set) {
//			totalScore += entry.getValue();
//			if (entry.getValue() > maxScore) {
//				maxScore = entry.getValue();
//				name = entry.getKey();
//			}
//		}
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			totalScore += map.get(key); // 값이 반환된다.
			if (map.get(key) > maxScore) {
				maxScore = map.get(key);
				name = key;
			}
		}
//		Collection<Integer> values = map.values();
//		for (Integer integer : values) {
//			totalScore += integer;
//			if (integer > maxScore) {
//				maxScore = integer;
//			}
//		}
		int avg = totalScore / map.size();
		System.out.println("평균점수: " + avg);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}
}
