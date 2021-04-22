package InterfaceAssignment;

public class TestHospital {

	public static void main(String[] args) {

		ApolloHospital ah = new ApolloHospital();
		ah.cardioServices();
		ah.covid19();
		ah.dentalServices();
		ah.dermatologyServices();
		ah.entServices();
		ah.medicalFacilities();
		ah.nutritionServices();
		ah.obstetricServices();
		ah.opthamologyServices();
		ah.orthopedicServices();
		ah.pediatricServices();
		ah.physioServices();
		ah.pharmacies();
		ah.vaccinations();
		System.out.println(IndianMedical.min_fee);
		IndianMedical.medicalReports();

		IndianMedical im = new ApolloHospital();
		im.covid19();
		im.dermatologyServices();
		im.medicalFacilities();
		im.orthopedicServices();
		im.pediatricServices();
		IndianMedical.medicalReports();
		System.out.println(IndianMedical.min_fee);

		CanadaMedical cm = new ApolloHospital();
		cm.covid19();
		cm.opthamologyServices();
		cm.pediatricServices();
		cm.physioServices();

		USMedical um = new ApolloHospital();
		um.cardioServices();
		um.dentalServices();
		um.obstetricServices();
		um.pediatricServices();

	}

}
