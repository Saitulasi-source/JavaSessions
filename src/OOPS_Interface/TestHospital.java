package OOPS_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.gynecServices();
		fh.medicalInsurance();
		fh.neuroServices();
		fh.oncologyServices();
		fh.orthoServices();
		fh.pathologyServices();
		fh.physioServices();
		fh.radioServices();
		System.out.println(USMedical.min_fee);
		USMedical.billing();
		fh.taxCollection();
		fh.covidTest();
		fh.RD();

		USMedical us = new FortisHospital();
		us.emergencyServices();
		us.neuroServices();
		us.orthoServices();
		us.radioServices();
		us.taxCollection();
		us.covidTest();
		System.out.println(USMedical.min_fee);

		UKMedical uk = new FortisHospital();
		uk.emergencyServices();
		uk.gynecServices();
		uk.physioServices();
		uk.covidTest();

		IndianMedical im = new FortisHospital();
		im.cardioServices();
		im.emergencyServices();
		im.oncologyServices();
		im.covidTest();

	}

}
