package learncollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
	
		
		//1. sort and then equals:
		
		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("A","B","D","C"));
		
		System.out.println(ar1);
		
		Collections.sort(ar1);
		
		System.out.println(ar1);
		
		ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList("A","B","C","E","D"));
		
		System.out.println(ar2);
		
	//	Arrays.sort(ar2); it accept only primitive arrays
		
		Collections.sort(ar2);
		
		System.out.println(ar2);
		
		System.out.println(ar1.equals(ar2));
		
		ArrayList<String> ar3 = new ArrayList<String>(Arrays.asList("A","E","C","B","D"));
		
		System.out.println(ar3);
		
		Collections.sort(ar3);
		
		System.out.println(ar3);
		
		System.out.println(ar3.equals(ar2));
		
		
		//2. compare two list - find out the additional elements:
		
		ArrayList<String> first = new ArrayList<String>(Arrays.asList("js","java","python","php"));
		
		ArrayList<String> second = new ArrayList<String>(Arrays.asList("java","python","js","ruby"));
		
		//first.removeAll(second);
		
		//System.out.println(first); php
		
		// find out the missing elements
		
		//second.removeAll(first);
		
		//System.out.println(second); // ruby
		
		
		// find out the common element
		
		first.retainAll(second);
		
		System.out.println(first);
		


		
		
		

	}

}
