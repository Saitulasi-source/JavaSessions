package Assignments;

import java.util.ArrayList;

public class ArrayListAssignment {

	public static void main(String[] args) {

		// 1. Write a Java program to create a new array list, add some colors (string)
		// and print out the collection

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Blue");
		ar.add("White");
		ar.add("Orange");
		ar.add("Yellow");
		ar.add("Green");
		ar.add("Red");
		ar.add("Brown");
		ar.add("Pink");
		System.out.println(ar);
		System.out.println("----------------------------");
//		2. Write a Java program to insert an element into the array list at the first and last positions.

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(20);
		ar1.add(30);
		ar1.add(40);
		ar1.add(50);
		ar1.add(60);
		System.out.println(ar1.size());
		System.out.println(ar1);
		ar1.add(0, 10);
		ar1.add(6, 70);
		System.out.println(ar1.size());
		System.out.println(ar1);
		System.out.println("----------------------------");
//		3. Write a Java program to retrieve an element (at a specified index) from a given array list.

		System.out.println(ar1.get(4));
		System.out.println(ar1.get(5));
		System.out.println("----------------------------");
//		 4. Write a Java program to update specific array element by given element.

		System.out.println(ar1);
		ar1.set(2, 25);
		System.out.println(ar1);
		System.out.println("----------------------------");
//		 5. Write a Java program to remove the third element from a array list. 

		System.out.println(ar1.size());
		System.out.println(ar1);
		ar1.remove(2);
		System.out.println(ar1.size());
		System.out.println(ar1);
		System.out.println("----------------------------");
//		 6. Write a Java program to search an element in a array list.

		System.out.println(ar1);
		if (ar1.contains(40)) {
			System.out.println("Element is found");
		} else {
			System.out.println("Element is not found");
		}
		System.out.println("----------------------------");
//		 7. Write a Java program to reverse elements in a array list

		System.out.println(ar1);
		for (int i = ar1.size() - 1; i >= 0; i--) {
			System.out.println(ar1.get(i));
		}
		System.out.println("----------------------------");
//		 8. Write a Java program to extract a portion of a array list.

		System.out.println(ar1);
		System.out.println(ar1.subList(0, 3));
		System.out.println("----------------------------");
//		 9. Write a Java program of swap two elements in an array list.
		System.out.println(ar1);
		int num1 = ar1.get(0);
		ar1.set(0, ar1.get(2));
		ar1.set(2, num1);
		System.out.println(ar1);
		System.out.println("----------------------------");
//		 10. Write a Java program to empty an array list.
		System.out.println(ar1);
		ar1.removeAll(ar1);
		System.out.println(ar1);
		System.out.println("----------------------------");
//		 11. Write a Java program to trim the virtual capacity of an array list the current list size.

		System.out.println(ar);
		ar.trimToSize();
		System.out.println(ar);
		System.out.println("----------------------------");
//		 12. Write a Java program to print all the elements of a ArrayList using the position of the elements

		System.out.println(ar);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("----------------------------");
		for (String e : ar) {
			System.out.println(e);
		}
		System.out.println("----------------------------");
		int j = 0;
		while (j < ar.size()) {
			System.out.println(ar.get(j));
			j++;
		}

	}

}
