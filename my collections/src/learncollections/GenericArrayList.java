package learncollections;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> marksList = new ArrayList<Integer>();

		marksList.add(100);

		// marksList.add(12.33); not allowed

		ArrayList<Double> aD = new ArrayList<Double>();

		aD.add(12.33);

		aD.add(22.5);

		// aD.add(12); not allowed

		ArrayList<String> str = new ArrayList<String>();

		str.add("tom");

		str.add("jerry");

		// str.add(12); not allowed

	}

}
