package Assignments;

public class LoopsAssignment {

	public static void main(String[] args) {

		// Print ASCII values
		for (char c = 'a'; c <= 'z'; c++) {
			int ascii = (int) c;
			System.out.println(ascii);
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println("I am Batman");
		}
		System.out.println("-----------------------");

		for (int i = 1; i < 10; i++) {
			System.out.println("I am Batman " + i);
		}
		System.out.println("-----------------------");

		// Print 10 to 1 using for loop
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("-----------------------");

		// print 10 to 1 using while loop
		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		System.out.println("-----------------------");

		// print 10 to 1 using do-while loop
		int a = 10;
		do {
			System.out.println(a);
			a--;
		} while (a >= 1);
		System.out.println("-----------------------");

		// program to print "Hello World" ten times using while loop
		int b = 1;
		while (b <= 10) {
			System.out.println("Hello World");
			b++;
		}
		System.out.println("-----------------------");

		// print 1 to 10 using while loop but quit if multiple of 7 is encountered
		int x = 1;
		while (x <= 10) {
			System.out.println(x);
			x++;
			if (x % 7 == 0) {
				break;
			}
		}
		System.out.println("-----------------------");

		// print even number (0,2,4,6,8,10) using for loop
		for (int p = 0; p <= 10; p++) {
			if (p % 2 == 0) {
				System.out.println(p);
			}
		}
		System.out.println("-----------------------");

		// print even number (0,2,4,6,8,10) using while loop
		int q = 0;
		while (q <= 10) {
			if (q % 2 == 0) {
				System.out.println(q);
			}
			q++;
		}
		System.out.println("-----------------------");

		// print even number (0,2,4,6,8,10) using do-while loop
		int t = 0;
		do {
			if (t % 2 == 0) {
				System.out.println(t);
			}
			t++;
		} while (t <= 10);
		System.out.println("-----------------------");

		// print odd number (1,3,5,7,9) using for loop
		for (int j = 1; j <= 10; j++) {
			if (j % 2 != 0) {
				System.out.println(j);
			}
		}
		System.out.println("-----------------------");

		// print odd number (1,3,5,7,9) using while loop
		int k = 1;
		while (k <= 10) {
			if (k % 2 != 0) {
				System.out.println(k);
			}
			k++;
		}
		System.out.println("-----------------------");

		// print odd number (1,3,5,7,9) using do-while loop
		int l = 1;
		do {
			if (l % 2 != 0) {
				System.out.println(l);
			}
			l++;
		} while (l <= 10);
	}

}
