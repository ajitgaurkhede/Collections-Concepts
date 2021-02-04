package LinkedListConcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		
		// LL is a default class in java
		//it can be used as List, Stack, Queue
		//it allows the null entry
		//dynamic collection
		//hence insertion and deletion can be easily implemented
		//it can contain duplicate elements
		//it is not synchronized(not thread safe) 
		//in LL, manipulation is fast because we don't  need any shifting
		//LL constructors
		// LinkedList();
		//LinkedList(Collection c);
		
		LinkedList<String> names = new LinkedList<String>();
		System.out.println(names.size());
		
		names.add("Tom");
		names.add("Naveen");
		
		System.out.println(names.size());
		System.out.println(names.get(1));
		
		names.forEach((k) -> System.out.println(k));
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		names.add(2,"Steve");
		System.out.println(names);
		
		names.add(1,"Ram");
		System.out.println(names);
		
		LinkedList<String> users = new LinkedList<String>();
		
		users.add("Peter");
		users.add("Trump");
		
		names.addAll(users);
		
		System.out.println(names);
		
		names.addFirst("Ramuu");
		System.out.println(names);
		
		names.addLast("Shamuu");
		System.out.println(names);
		
		names.remove(2);
		System.out.println(names);
		
		names.removeAll(users);
		System.out.println(names);
		
		names.removeFirst();
		names.removeLast();
		
		System.out.println(names);
		
		names.clear();
		System.out.println(names);
		
		
		
		LinkedList<String> lang = new LinkedList<String>();		
		lang.add("java");
		lang.add("python");
		lang.add("ruby");
		lang.add("c");
		
		// reverse order
		
		Iterator<String> itr = lang.descendingIterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Collections.sort(lang);
		System.out.println(lang);

	}

}
