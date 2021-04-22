package EncapsulationAssignment;

public class TestStudent {

	public static void main(String[] args) {

		Student st = new Student();
		st.setStdName("Sai");
		String name = st.getStdName();
		System.out.println(name);
		st.setStdRollNo(19);
		int rollNo = st.getStdRollNo();
		System.out.println(rollNo);
		st.setStdId(575);
		int stdId = st.getStdId();
		System.out.println(stdId);

	}

}
