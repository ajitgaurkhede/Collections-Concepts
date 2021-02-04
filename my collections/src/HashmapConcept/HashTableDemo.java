package HashmapConcept;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
	
		Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
		marks.put("Hp", 100);
		marks.put("Dell", 200);
		marks.put("Lenovo", 300);
		marks.put("Dell", 400);
		marks.put("Asus", 600);
		//marks.put(null, null); //java.lang.NullPointerException
		//marks.put(null, 700); //java.lang.NullPointerException
		
		//HashTable does not allow key = null and value = null
		
		System.out.println(marks.get("Hp"));

		
	}

}
