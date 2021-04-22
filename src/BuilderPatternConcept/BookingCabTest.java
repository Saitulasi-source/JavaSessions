package BuilderPatternConcept;

public class BookingCabTest {

	public static void main(String[] args) {
		UberApp ub = new UberApp();
		ub.doLogin("sai", "sai123")
			.bookUberCab("Bharatnagar", "Kukatpally")
				.searchVehicleOption("Bharatnagar", "Kukatpally")
					.getDriverVehicleInfo("Bharatnagar", "Kukatpally", "Sedan")
						.confirmRide("Bharatnagar", "Kukatpally")
							.doPayment("2134 5123 4312 314", "1575")
								.getBookingDetails("Bharatnagar", "Kukatpally")
									.cancelRide("Bharatnagar", "Kukatpally")
										.logout();
		UberApp ub1 = new UberApp();
		ub1.doLogin("sai", "sai123")
				.bookUberCab("Bharatnagar", "Kukatpally")
					.getBookingDetails("Bharatnagar", "Kukatpally")
						.logout();
		
		UberApp ub2 = new UberApp();
		ub2.doLogin("sai", "sai123")
			.bookUberCab("Bharatnagar", "Kukatpally")
				.confirmRide("Bharatnagar", "Kukatpally")
					.cancelRide("Bharatnagar", "Kukatpally")
						.logout();
		
		UberApp ub3 = new UberApp();
		ub3.doLogin("sai", "sai123")
				.logout();
	}

}
