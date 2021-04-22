package OOPS_Interface;

public interface USMedical extends WHO{

	int min_fee = 10;

	public void orthoServices();

	public void neuroServices();

	public void radioServices();

	public void emergencyServices();

	public static void billing() {
		System.out.println("USMedical-billing");
	}

	default void taxCollection() {
		System.out.println("USMedical- 30% taxcollection");
	}

}
