package HashmapConcept;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(3000, "Steve");
		map.put(11000, "Naveen");
		map.put(1400, "Robby");
		
		System.out.println(map);
		map.forEach((k,v) -> System.out.println("Key = "+k+" Value = "+v));
		System.out.println(map.lastKey());
		System.out.println(map.firstKey());
		
		Set<Integer> keyLessThan3k = map.headMap(3000).keySet();
		System.out.println(keyLessThan3k);
		
		Set<Integer> keyGret = map.tailMap(3000).keySet();
		System.out.println(keyGret);
		
		TreeMap<String, Integer> UserMap = new TreeMap<>();
		
		UserMap.put("James", 100);
		UserMap.put("Brad", 200);
		UserMap.put("Albert", 40);
		UserMap.put("George", 20);
		UserMap.put("Larry", 10);
		UserMap.put("Ted", 900);
		UserMap.put("Paul", 140);
		
		UserMap.forEach((k,v) -> System.out.println("Key = "+k+"\t Value = "+v));
		
		System.out.println("-----------------------");
		
		TreeMap<String, Integer> UserMap1 = new TreeMap<>(Comparator.reverseOrder());
		
		UserMap1.put("James", 100);
		UserMap1.put("Brad", 200);
		UserMap1.put("Albert", 40);
		UserMap1.put("George", 20);
		UserMap1.put("Larry", 10);
		UserMap1.put("Ted", 900);
		UserMap1.put("Paul", 140);
		
		UserMap1.forEach((k,v) -> System.out.println("Key = "+k+"\t Value = "+v));
		
		
		
		
	}

}
