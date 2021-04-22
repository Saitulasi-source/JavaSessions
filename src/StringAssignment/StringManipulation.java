package StringAssignment;

public class StringManipulation {

	public static void main(String[] args) {

		String st = "Hi this is my java code and I am so happy";

		System.out.println(st.indexOf("i")); // 1st occurence of i
		System.out.println(st.indexOf("i", st.indexOf("i") + 1)); // 2nd occurence of i
		System.out.println(st.indexOf("i", st.indexOf("i", st.indexOf("i") + 1) + 1)); // 3rd occurence of i

		String user = "Peter.test@123.admin.1928";
		System.out.println(user.split("\\.")[0]);
		System.out.println(user.split("\\.")[1]);
		System.out.println(user.split("\\.")[2]);
		System.out.println(user.split("\\.")[3]);
	}

}
