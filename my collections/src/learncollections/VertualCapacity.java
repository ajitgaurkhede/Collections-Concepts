package learncollections;

import java.util.ArrayList;

public class VertualCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> ar = new ArrayList<Object>(); // vrtual default capacity = 10

		// ArrayList<Object> ar = new ArrayList<Object>(20); // vrtual capacity = 20

		System.out.println(ar.size()); // physical = 0

		ar.add(25);

		System.out.println(ar.size()); // physical = 1

		ar.add(20);

		ar.add(30);

		ar.add(40);

		System.out.println(ar.size()); // physical = 4

	}

}
