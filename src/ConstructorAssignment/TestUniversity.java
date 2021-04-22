package ConstructorAssignment;

import java.util.ArrayList;

public class TestUniversity {

	public static void main(String[] args) {

		ArrayList<String> course = new ArrayList<String>();
		course.add("CSE");
		course.add("IT");
		course.add("ECE");
		course.add("EEE");
		course.add("EIE");

		University un = new University("JNTU");
		System.out.println(un.getName());

		University un1 = new University("IIT", "India");
		System.out.println(un1.getName());
		System.out.println(un1.getCountry());

		University un2 = new University("BITS", course);
		System.out.println(un2.getName());
		System.out.println(un2.getCourse());
		System.out.println(un2.course.size());
		for (int i = 0; i < un2.course.size(); i++) {
			System.out.println(un2.course.get(i));
		}

		University un3 = new University("CALUMS", "USA", "20-09-2000");
		System.out.println(un3.getName() + " " + un3.getCountry() + " " + un3.getEstablishedDate());
		University un4 = new University("CALFT", "USA", course);
		System.out.println(un4.getName() + " " + un4.getCountry() + " " + un4.getCourse());
		University un5 = new University("CALUOI", "Canada", "19-08-1999", course);
		System.out.println(
				un5.getName() + " " + un5.getCountry() + " " + un5.getEstablishedDate() + " " + un5.getCourse());

	}

}
