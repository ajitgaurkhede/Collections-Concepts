package learncollections;

import java.util.ArrayList;

public class MyCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ArrayList ar = new ArrayList();
		 * 
		 * ar.add(100);
		 * 
		 * ar.add(200);
		 * 
		 * ar.add("testing");
		 * 
		 * ar.add('t');
		 * 
		 * ar.add(12.33);
		 * 
		 * ar.add(true);
		 * 
		 * System.out.println(ar);
		 */

		ArrayList<Object> ar1 = new ArrayList<Object>();

		ar1.add(100);

		ar1.add(200);

		ar1.add("testing");

		ar1.add('t');

		ar1.add(12.33);

		ar1.add(true);

		System.out.println(ar1);

		// Random Acess

		System.out.println(ar1.get(2));

		// System.out.println(ar1.get(6)); index out of bond
		// System.out.println(ar1.get(-2));

		// size

		System.out.println(ar1.size());

		// low index and hi index

		System.out.println("LI " + 0);

		System.out.println("Hi " + (ar1.size() - 1));

		ar1.add(20);

		ar1.add("str");

		System.out.println(ar1.size()); // dynamic nature

	}

}
