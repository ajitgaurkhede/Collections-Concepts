package SetConcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String>();
			
			hs.add("Alpha");
			hs.add("testing");
			hs.add("Beta");
			hs.add("Alpha");
			hs.add(null);
			System.out.println(hs);
		
			System.out.println(hs.contains("testing"));
			
			for(String str : hs)
				System.out.println(str);
			
			hs.remove("Beta");
			System.out.println(hs);
			
			Set<Integer> first = new HashSet<Integer>();
			first.addAll(Arrays.asList(new Integer[] {1,3,4,5,6,8,9,10}));
			
			Set<Integer> second = new HashSet<Integer>();
			second.addAll(Arrays.asList(new Integer[] {1,3,5,6,7,9}));
			
			//get the union:
			Set<Integer> union = new HashSet<Integer>(first);
			union.addAll(second);
			System.out.println(union); // unique elements
			
			System.out.println("---------------------");
			
			//get the intersection:
			
			Set<Integer> intersection = new HashSet<Integer>(first);
			intersection.retainAll(second);
			System.out.println(intersection); //common elements
			
			//get the difference:
			Set<Integer> diff = new HashSet<Integer>(first);
			diff.removeAll(second);
			System.out.println(diff); // missing elements
			
			
			

	}

}
