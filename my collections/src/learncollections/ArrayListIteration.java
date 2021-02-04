package learncollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<String>();

		studentList.add("Tom"); // 0

		studentList.add("Naveen"); // 1

		studentList.add("Steve"); // 2

		studentList.add("Lisa"); // 3

		// typical for loop ;

		for (int i = 0; i < studentList.size(); i++) {

			System.out.println(studentList.get(i));

		}

		System.out.println("-------------for each------------------");

		// for each loop

		for (String str : studentList) {

			System.out.println(str);

		}

		System.out.println("------------lambda-------------------");

		// JDK 8 - streams with lambda:

		studentList.stream().forEach(ele -> System.out.println(ele));

		// iterator

		System.out.println("------------iterator-------------------");

		Iterator<String> it = studentList.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));

		System.out.println(numbers);

		ArrayList<String> mobile = new ArrayList<String>(Arrays.asList("One Plus", "Samsung", "Redmi", "Micromax"));

		Iterator<String> i = mobile.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());

		}

	}

}
