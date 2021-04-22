package AccessModifiers;

public class Bus {

	public static void main(String[] args) {

		Car c = new Car();
		c.model = "Chevrolet";
		c.price = 2000;
		c.gearType = "Manual";
		c.start();
		c.oilChange();
		c.refuel();

	}

}
