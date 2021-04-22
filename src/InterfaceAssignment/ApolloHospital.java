package InterfaceAssignment;

public class ApolloHospital extends HealthCare implements IndianMedical, CanadaMedical, USMedical {

	@Override
	public void covid19() {
		System.out.println("AH - Covid19");

	}

	@Override
	public void obstetricServices() {
		System.out.println("AH - Obstetric Services");

	}

	@Override
	public void dentalServices() {
		System.out.println("AH - Dental Services");

	}

	@Override
	public void cardioServices() {
		System.out.println("AH - Cardio Services");

	}

	@Override
	public void opthamologyServices() {
		System.out.println("AH - Opthamology Services");

	}

	@Override
	public void physioServices() {
		System.out.println("AH - Physio Services");

	}

	@Override
	public void pediatricServices() {
		System.out.println("AH - Pediatric Services");

	}

	@Override
	public void orthopedicServices() {
		System.out.println("AH - Orthopedic Services");

	}

	@Override
	public void dermatologyServices() {
		System.out.println("AH - Dermatology Services");

	}

	@Override
	public void medicalFacilities() {
		System.out.println("AH - Medical Facilities");
	}

	public void entServices() {
		System.out.println("AH - ENT Services");
	}

	public void nutritionServices() {
		System.out.println("AH - Nutrition Services");
	}

}
