package learncollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

class Team{
	
	String name ;
	
	int id ;
	
	
}


public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,1,2,4,5,2,3,4,5,6,7,8,4,10));
		
		System.out.println(numbers);
		
		//1. LinkedHashSet is class which implements to Set which does not allow duplicate value
		
		LinkedHashSet<Integer> uniqueList = new LinkedHashSet<Integer>(numbers);
		
		System.out.println(uniqueList);
		
		Team []  arr = new Team[2] ;
		
		arr[0] = new Team();
		
		arr[0].name = "abc";
		
		arr[0].id = 1 ;
		
		
		arr[1] = new Team();
		
		arr[1].name = "abccc";
		
		arr[1].id = 122 ;
		
		
		LinkedHashSet<Team > team = new LinkedHashSet<Team >() ;
		
		team.add(arr[0]);
		
		team.add(arr[1]);

		
	
		
		System.out.println(team);
		
		for(Team e : team) {
			
			System.out.println(e.id+" "+e.name);
		}
		
		
		/* for(Book b:hs){  
			    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
			    }  */
		
		
		//2. JDK 8 - stream
		
	/*	ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(10,52,10,22,55,10,22,25));
		
		System.out.println(marksList);
		
		java.util.List<Integer> uniqueMarks = marksList.stream().distinct().collect(Collectors.toList());

		System.out.println(uniqueMarks);
		
		
		*/

	}

}
