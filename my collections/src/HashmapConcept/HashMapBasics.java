package HashmapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;



public class HashMapBasics {

	public static void main(String[] args) {
		
		// no order - no indexing 
		
		// stores values -- Key-Value <k,v>
		
		// Key can not be duplicate
		
		// hashmap is not thread-safe
		
		HashMap<String,String> district = new HashMap<String, String>();
		
		district.put("Bori", "Katol");
		
		district.put("Katol", "Nagpur");
		
		district.put("Katol", "Nagpur"); // can not allow duplicate value
		
		district.put("Zilpa", "Katol");
		
		//district.put("Katol", null); recent value
		
		district.put(null, "Nag");



		/*System.out.println(district);
		
		
		System.out.println(district.get("Katol")); // aces value using get - key
		
		System.out.println(district.get(null));*/
		
		System.out.println(district.get("Bori"));
		
		System.out.println(district.get("Zilpa"));

		
		// iterator : over the keys : by using keySet()
		
		Iterator<String> it = district.keySet().iterator();
		
		
		while(it.hasNext()) {
			
			String key = it.next();
			String value = district.get(key);
			System.out.println("Key = "+key+ " value =" + value);
			
		}

		
		// iterator over the set(pair) : by using entrySet
		
		System.out.println("------------------------------");
		
		Iterator<Entry<String,String>> it1 = district.entrySet().iterator();
		
		while(it1.hasNext()) {
			
			Entry<String, String> entry = it1.next();
			System.out.println("key = "+ entry.getKey() + " and value = " + entry.getValue());
			
		}
		
		
		// iterate hasmap using java 8 for each and lambda:
		
		System.out.println("************");
		
		district.forEach((k,v) -> System.out.println("key = " +k+" and value ="+v));
		
		
		
		
		

	}

}
