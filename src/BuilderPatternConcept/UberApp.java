package BuilderPatternConcept;

public class UberApp {

	public UberApp doLogin(String un, String pwd) {
		System.out.println("login with : " + un + " " + pwd);
		return this;
	}

	public UberApp bookUberCab(String source, String destination) {
		System.out.println("booking the cab: " + source + " " + destination);
		return this;
	}

	public UberApp searchVehicleOption(String source, String destination) {
		System.out.println("search vehicle option: " + source + " " + destination);
		return this;
	}

	public UberApp getDriverVehicleInfo(String source, String destination, String vehicleName) {
		System.out.println("get driver and vehicle info: " + source + " " + destination + " " + vehicleName);
		return this;

	}

	public UberApp confirmRide(String source, String destination) {
		System.out.println("confirm ride: " + source + " " + destination);
		return this;

	}

	public UberApp doPayment(String CC, String pwd) {
		System.out.println("payment done with" + CC + " : " + pwd);
		return this;

	}

	public UberApp getBookingDetails(String source, String destination) {
		System.out.println("get order details for : " + source + " " + destination);
		return this;

	}

	public UberApp cancelRide(String source, String destination) {
		System.out.println("cancel the ride : " + source + " " + destination);
		return this;

	}

	public UberApp logout() {
		System.out.println("logout from app");
		return this;
	}

}
