package Assignments;

public class MethodsAssignments {

//	1. Write a program to print the sum of two numbers entered by defining your own method.

	public int sum(int a, int b) {
		System.out.println("Sum method");
		int c = a + b;
		return c;
	}

//	2. Define a method that returns the product of two numbers entered 

	public int product(int x, int y) {
		System.out.println("Multiplication method");
		int z = x * y;
		if ((x == 0) || (y == 0)) {
			return 0;
		} else
			return z;
	}

//  3. Write a program to print the circumference and area of a circle of radius entered by defining your own method.

	public double[] circle(double radius) {
		System.out.println("Circumference and area of a circle method");
		double circleparam[] = new double[2];
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		circleparam[0] = circumference;
		circleparam[1] = area;
		return circleparam;
	}

//	4. Define two methods to print the maximum and the minimum number respectively among three numbers entered.

	public int maxNum(int num1, int num2, int num3) {
		System.out.println("Maximum number method");
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3) {
			return num2;
		} else
			return num3;
	}

	public int minNum(int num1, int num2, int num3) {
		System.out.println("Minimum number method");
		if (num1 < num2 && num1 < num3) {
			return num1;
		} else if (num2 < num3) {
			return num2;
		} else
			return num3;
	}

//	5. Define a program to find out whether a given number is even or odd.

	public void evenOddNum(int num) {
		System.out.println("Even/Odd number method");
		if (num % 2 == 0) {
			System.out.println(num + " is an even number");
		} else {
			System.out.println(num + " is a odd number");
		}
	}

//6. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

	public void eligibleToVote(int age) {
		System.out.println("Eligible to vote method");
		if (age >= 18) {
			System.out.println("He/She is eligible to vote");
		} else
			System.out.println("He/She is not eligible to vote");
	}

//	7. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//		Marks        Grade
//		91-100         AA
//		81-90          AB
//		71-80          BB
//		61-70          BC
//		51-60          CD
//		41-50          DD
//		<=40          Fail

	public String getGrade(int marks) {
		System.out.println("Grade method");
		String grade = null;
		if ((marks >= 91) && (marks <= 100)) {
			grade = "AA";
		} else if ((marks >= 81) && (marks <= 90)) {
			grade = "AB";
		} else if ((marks >= 71) && (marks <= 80)) {
			grade = "BB";
		} else if ((marks >= 61) && (marks <= 70)) {
			grade = "BC";
		} else if ((marks >= 51) && (marks <= 60)) {
			grade = "CD";
		} else if ((marks >= 41) && (marks <= 50)) {
			grade = "DD";
		} else {
			grade = "FAIL";
		}
		return grade;
	}

//	8. Write a program to print the factorial of a number by defining a method named 'Factorial'.
//	The Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//	4! = 1*2*3*4 = 24
//	3! = 3*2*1 = 6
//	2! = 2*1 = 2
//	Also,
//	1! = 1
//	0! = 0

	public int factorial(int num) {
		System.out.println("Factorial of a number method");
		int fact = 1;
		if (num == 0) {
			return 1;
		}
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {

		MethodsAssignments obj = new MethodsAssignments();
		int add = obj.sum(19, 28);
		System.out.println("Sum of two numbers is : " + add);
		int mul = obj.product(12, 13);
		System.out.println("Product of two numbers is : " + mul);
		int mul1 = obj.product(25, 0);
		System.out.println("Product of two numbers is : " + mul1);
		int mul2 = obj.product(0, 10);
		System.out.println("Product of two numbers is : " + mul2);
		int mul3 = obj.product(0, 0);
		System.out.println("Product of two numbers is : " + mul3);
		double cirvalues[] = obj.circle(5.75);
		for (double d : cirvalues) {
			System.out.println("The circumference and area of a circle are :" + d);
		}
		int max = obj.maxNum(1000, 2500, 200);
		System.out.println("Maximum number is : " + max);
		int min = obj.minNum(1000, 2500, 200);
		System.out.println("Minimum number is : " + min);
		obj.evenOddNum(89);
		obj.evenOddNum(100);
		obj.eligibleToVote(18);
		obj.eligibleToVote(16);
		String grad = obj.getGrade(30);
		System.out.println("Grade is : " + grad);
		int factnum = obj.factorial(5);
		System.out.println("Factorial is : " + factnum);
		int factnum1 = obj.factorial(0);
		System.out.println("Factorial is : " + factnum1);
		int factnum2 = obj.factorial(1);
		System.out.println("Factorial is : " + factnum2);
	}

}
