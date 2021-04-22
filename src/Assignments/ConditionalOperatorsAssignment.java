package Assignments;

public class ConditionalOperatorsAssignment {

	public static void main(String[] args) {
		int x = 25;
		int y = 78;
		int z = 87;

		if ((x > y) && (x > z)) {
			System.out.println("The greatest:" + x);
		} else if (y > z) {
			System.out.println("The greatest:" + y);
		} else {
			System.out.println("The greatest:" + z);
		}

		System.out.println("---------------------------");

		int a = 25;
		int b = 78;
		int c = 87;
		int d = 91;

		if (((a > b) && (a > c)) && (a > d)) {
			System.out.println("The greatest:" + a);
		} else if ((b > c) && (b > d)) {
			System.out.println("The greatest:" + b);
		} else if (c > d) {
			System.out.println("The greatest:" + c);
		} else {
			System.out.println("The greatest:" + d);
		}

		System.out.println("---------------------------");

		// write a java program to test a number is positive or negative

		int num = 35;

		if (num > 0) {
			System.out.println(num + "--Positive number");
		} else {
			System.out.println(num + "--Negative number");
		}

		int num1 = -11;

		if (num1 > 0) {
			System.out.println(num1 + "--Positive number");
		} else {
			System.out.println(num1 + "--Negative number");
		}

		System.out.println("---------------------------");

//		Write a Java program to test a person is eligible for vote
//		age is greater than equal to 18 and alive: eligible 
//		age is less than to 18 and alive: not eligible
//		if not alive: print person does not exist.

		int age = 28;
		boolean alive = true;
		if ((age >= 18) && (alive == true)) {
			System.out.println("Eligible for vote");
		} else if ((age < 18) && (alive == true)) {
			System.out.println("Not eligible for vote");
		} else if (alive == false) {
			System.out.println("person does not exist");
		}

	}

}
