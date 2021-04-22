package JavaSessions;

public class FinalizeMethod {
	
	String name = "Tom";

	public static void main(String[] args) {

		FinalizeMethod obj = new FinalizeMethod();
		obj = null;
	
		
		Window w = new Window();
		w = null;
		System.gc();

	}

	@Override
	public void finalize() {
		System.out.println("FinalizeMethod -- Finalize");
	}

}
