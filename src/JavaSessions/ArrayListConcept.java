package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(100);

		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size());
		System.out.println(ar);

		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add("test");
		ar.add('F');
		ar.add(12.23);
		ar.add(true);
		ar.add("Tom");
		ar.add("C++");

		System.out.println(ar.size());
		System.out.println(ar);
		System.out.println(ar.get(4));
		System.out.println(ar.get(9));
		ar.add("Sai");
		ar.add('a');
		ar.add('b');
		ar.add("java");
		ar.add('*');
		System.out.println(ar.size());
		System.out.println(ar);
		System.out.println(ar.get(14));

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		ar.add(50);
		ar.add(60);
		ar.add(70);
		ar.add(80);
		ar.add(90);
		ar.add(100);
		ar.add(110);
		System.out.println(ar.size());
		ar.add(120);
		ar.add(130);
		ar.add(140);
		

	}

}
