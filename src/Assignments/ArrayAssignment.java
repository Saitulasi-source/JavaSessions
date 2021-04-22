package Assignments;

public class ArrayAssignment {

	public static void main(String[] args) {
		for (int i = 0; i <= 39; i++) {
			if ((i > 0) && (i % 10 == 0)) {
				System.out.print("\n");
			}
			String s = String.format("%02d ", i);
			System.out.print(s);
		}
		System.out.println();
		System.out.println("---------------------------");
//		Write a program to create a static Array, having following cricket data:
//		--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
//		--Try to create multiple Object Arrays for different players 
//		--Try to print all the values of each player on the console using normal for/while loop and for each loop

		Object ob[] = new Object[7];
		ob[0] = "Ram";
		ob[1] = 20;
		ob[2] = "India";
		ob[3] = "08/08/2001";
		ob[4] = 'M';
		ob[5] = 75.57;
		ob[6] = true;
		Object ob1[] = new Object[7];
		ob1[0] = "Tom";
		ob1[1] = 22;
		ob1[2] = "Australia";
		ob1[3] = "08/04/1999";
		ob1[4] = 'M';
		ob1[5] = 93.04;
		ob1[6] = true;
		Object ob2[] = new Object[7];
		ob2[0] = "Phil";
		ob2[1] = 21;
		ob2[2] = "Newzealand";
		ob2[3] = "08/01/2000";
		ob2[4] = 'M';
		ob2[5] = 100.08;
		ob2[6] = true;
		Object ob3[] = new Object[7];
		ob3[0] = "yuvin";
		ob3[1] = 25;
		ob3[2] = "India";
		ob3[3] = "10/09/2005";
		ob3[4] = 'M';
		ob3[5] = 100.00;
		ob3[6] = true;

		for (int k = 0; k < ob.length; k++) {
			System.out.println(ob[k]);
		}
		int j = 0;
		while (j < ob1.length) {
			System.out.println(ob1[j]);
			j++;
		}
		for (Object e : ob2) {
			System.out.println(e);
		}
		for (Object e : ob3) {
			System.out.println(e);
		}

	}

}
