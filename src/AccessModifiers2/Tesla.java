package AccessModifiers2;

import AccessModifiers.Car;

public class Tesla extends Car {

	public static void main(String[] args) {

		Car c = new Car();
		c.price = 10000;
		c.oilChange();

		Tesla t = new Tesla();
		t.price = 20000;
		t.gearType = "Automated";
		t.oilChange();
		t.refuel();

	}

}
