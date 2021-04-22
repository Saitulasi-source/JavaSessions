package InheritanceAssignment;

public class University extends CentralUniversity {

	static String course = "Computer Science";
	int marks = 100;

	public void teaching() {
		System.out.println("University--Teaching method");
	}

	public static void ranking() {
		System.out.println("University--Ranking method");
	}

	public void research() {
		System.out.println("University-Research method");
	}

	public void assessment() {
		System.out.println("University--Assessment method");
	}

}
