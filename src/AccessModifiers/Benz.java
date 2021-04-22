package AccessModifiers;

public class Benz extends Car {

	public static void main(String[] args) {

		Benz b = new Benz();
		b.model = "Benz Model2";
		b.price = 5000;
		b.gearType = "Automated";
		b.start();
		b.oilChange();
		b.refuel();
		Car c = new Car();
		c.model = "Dodge";
		c.price = 7000;
		c.gearType = "Manual";
		c.start();
		c.oilChange();
		c.refuel();

	}

}
