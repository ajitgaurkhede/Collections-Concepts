package learncollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncronizedArrayList {

	public static void main(String[] args) {
		
		// 1. Coolections.synchronizedList
		
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		
		nameList.add("Java");
		
		nameList.add("python");
		
		nameList.add("Ruby");
		
		// add, remove - we don't need explicit synchronization
		
		// to fetch/traverse the values from this -- we have to use explicit synchronization
		
		synchronized(nameList) {
			
			Iterator<String> it = nameList.iterator();
			
			while(it.hasNext()) {
				
				System.out.println(it.next());
				
			}
			
			
			
		}
		
		
		//2. CopyOnWriteArrayList -- its a class:
		
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		
		empList.add("Tom");
		
		empList.add("Steve");
		
		empList.add("Jerry");
		
		// we dont need explicit synchronization for any operation : add / remove / traverse
		
	Iterator<String> it =	empList.iterator();
	
	while(it.hasNext()) {
		
		
		System.out.println(it.next());
		
		
		
	}
		
		
		
		
		
	}

}
