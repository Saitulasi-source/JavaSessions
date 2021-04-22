package StringAssignment;

public class StringReverse {

	public static void main(String[] args) {

		String s = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		String lang[] = s.split("_");
		String revstring = "";

		for (int i = 0; i < lang.length; i++) {
			String langs = lang[i];
			String rev = "";
			for (int j = langs.length() - 1; j >= 0; j--) {
				rev = rev + langs.charAt(j);
			}
			System.out.println(rev);
			revstring = revstring + rev + "_";
		}

		System.out.println(revstring.substring(0, revstring.length() - 1));

	}
}