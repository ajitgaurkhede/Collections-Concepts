package VectorConcept;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> myVector = new Vector<Integer>();
		
		myVector.add(2);
		myVector.add(4);
		myVector.add(6);
		myVector.add(8);
		myVector.add(10);
		myVector.add(12);
		
		System.out.println(myVector);
		
		System.out.println(myVector.get(2));
		
		myVector.remove(3);
		
		System.out.println(myVector);

		Vector<Integer> yourVector = new Vector<Integer>();
		
		yourVector.add(10);
		yourVector.add(11);
		
		myVector.addAll(yourVector);
		
		System.out.println(myVector);
		
		

	}

}
