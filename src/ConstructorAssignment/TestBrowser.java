package ConstructorAssignment;

import java.util.ArrayList;

public class TestBrowser {

	public static void main(String[] args) {

		ArrayList<String> plugins = new ArrayList<String>();
		plugins.add("Java");
		plugins.add("Adobe Flash");
		plugins.add("Silverlight");
		plugins.add("Realplayer");
		plugins.add("Quicktime");
		Browser br = new Browser("Chrome");
		System.out.println(br.getBrowserName());
		Browser br1 = new Browser("Opera", "webkit");
		System.out.println(br1.getBrowserName() + " " + br1.getVendorName());
		Browser br2 = new Browser("Firefox", "moz", "87.5");
		System.out.println(br2.getBrowserName() + " " + br2.getVendorName() + " " + br2.getCurrentVersion());
		Browser br3 = new Browser("Safari", "webkit", "11.0", plugins);
		System.out.println(br3.getPlugins());
		System.out.println(br3.plugins);
		System.out.println(br3.plugins.size());
		for (int i = 0; i < br3.plugins.size(); i++) {
			System.out.println(br3.plugins.get(i));
		}
		System.out.println(br3.getBrowserName() + " " + br3.getVendorName() + " " + br3.getCurrentVersion() + " "
				+ br3.getPlugins());

	}

}
