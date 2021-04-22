package SuperKeyword;

public class Car {

	int speed = 120;

	public Car() {
		System.out.println("Car--Const...");
	}

	public Car(int i) {
		System.out.println("The value of i is : " + i);
	}

	public void start() {
		System.out.println("Car--Start");
	}

	public void display() {
		System.out.println("Car--display");
	}

}
