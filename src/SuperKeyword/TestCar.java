package SuperKeyword;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW("320D");
		System.out.println(b.speed);
		System.out.println(b.name);
		b.checkSpeed();
		b.display();
	}

}
