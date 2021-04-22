package AccessModifiers;

public class Car {

	String model;
	private String color;
	public int price;
	protected String gearType;

	public static void main(String[] args) {
		Car c = new Car();
		c.model = "Tesla Model1";
		c.color = "White";
		c.price = 50000;
		c.gearType = "Automated";
		c.start();
		c.stop();
		c.oilChange();
		c.refuel();

	}

	void start() {
		System.out.println("Car--Start method");
	}

	private void stop() {
		System.out.println("Car--Stop method");
	}

	public void oilChange() {
		System.out.println("Car--Oil Change method");
	}

	protected void refuel() {
		System.out.println("Car--Refuel method");
	}

}
