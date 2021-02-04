package HashmapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 5000);
		compMap.put("Cisco", 15000);
		
		System.out.println("Comp map size : "+ compMap.size());
		
		Iterator it = compMap.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}
		
		System.out.println("---------------------------------------");
		
		compMap.forEach((k,v) -> System.out.println("Key=" + k + "value ="+v));
		
		// covert hashmap keys into ArrayList:
		
		List<String> compNamesList = new ArrayList<String>(compMap.keySet());
		System.out.println(compNamesList.size());
		for(String t : compNamesList)
			System.out.println(t);
		
		System.out.println("----------------------------------");
		
		List<Integer> EmpValuesList = new ArrayList<>(compMap.values());
		for(Integer e: EmpValuesList)
			System.out.println(e);
		
		

	}

}
