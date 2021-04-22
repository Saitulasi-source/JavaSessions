package InterfaceAssignment;

public interface IndianMedical extends WHO {

	int min_fee = 100;

	public void pediatricServices();

	public void orthopedicServices();

	public void dermatologyServices();

	public static void medicalReports() {
		System.out.println("Indian - Medical Reports");
	}

	default void medicalFacilities() {
		System.out.println("Indian - Medical Facilities");
	}

}
