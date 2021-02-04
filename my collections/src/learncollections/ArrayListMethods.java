package learncollections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<String>();

		ar1.add("java");

		ar1.add("python");

		ar1.add("ruby");

		ar1.add("javascrpt");

		ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList("C", "C++"));

		// ar1.addAll(ar2); add from ar1 of last index

		/*
		 * System.out.println(ar1);
		 * 
		 * ar1.addAll(2,ar2); // add from ar1 of index 2
		 * 
		 * System.out.println(ar1);
		 * 
		 * ar1.clear(); // clear the whole list or make empty
		 * 
		 * System.out.println(ar1);
		 */

		@SuppressWarnings("unchecked")
		ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();

		System.out.println(cloneList);

		System.out.println(ar1.contains("python")); // to find element in list if found then return true else return
													// false : true

		System.out.println(ar1.contains("Kotlin"));

		System.out.println(ar1.indexOf("java")); // return indexof element

		System.out.println(ar1.indexOf("ruby") > 0); // u can veryfy index

		ArrayList<String> mobiles = new ArrayList<String>(
				Arrays.asList("Apple", "One Plus", "Vivo", "Realme", "Apple", "Samsung"));

		System.out.println(mobiles);

		System.out.println(mobiles.indexOf("Apple")); // return from starts index : 0 if not found then : -1

		System.out.println(mobiles.lastIndexOf("Apple")); // return from last index : 4

		mobiles.remove(0); // remove with value of index int

		System.out.println(mobiles);

		mobiles.remove("Apple"); // remove with contain string

		System.out.println(mobiles);

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

		System.out.println(numbers);

		numbers.removeIf(num -> num % 2 == 0); // remove with using if condition like even numbers

		System.out.println(numbers);

		ArrayList<String> mob = new ArrayList<String>(
				Arrays.asList("Apple", "One Plus", "Vivo", "Realme", "Apple", "Samsung", "Apple"));

		System.out.println(mob);

		mob.retainAll(Collections.singleton("Apple")); // return common element with occurance

		System.out.println(mob);

		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

		System.out.println(num);

		ArrayList<Integer> numSubList = new ArrayList<Integer>(num.subList(2, 9)); // latsindex - 1

		System.out.println(numSubList);

		ArrayList<String> tempList = new ArrayList<String>(
				Arrays.asList("Apple", "One Plus", "Vivo", "Realme", "Apple", "Samsung"));

		Object arr[] = tempList.toArray(); // covert arraylist to static array single dia

		System.out.println(Arrays.toString(arr));

		for (Object o : arr) {

			System.out.println((String) o);

		}

	}

}
