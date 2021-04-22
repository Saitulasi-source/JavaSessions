package SuperKeyword;

public class BMW extends Car {
	int speed = 150;
	String name;

	public BMW() {
		super(10);
		System.out.println("BMW--Const...");
	}

	public BMW(String name) {
		super(10);
		this.name = name;

	}

	public void checkSpeed() {
		System.out.println("BMW--checkSpeed");
		System.out.println(super.speed);
	}

	public void display() {
		System.out.println("BMW--Display");
		super.display();
	}
}
