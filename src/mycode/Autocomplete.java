package mycode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Autocomplete {
// I am testing git check in

	public static String [] dict = {"abc", "acd", "bcd", "def", "a", "aba"};
//main method
	public static void main(String args[]) {
		String prefix = null;
		if (args != null && args.length > 0) {
			prefix = args[0];
		}
		else {
			prefix = "de";
		}
		
		ArrayList<String> list = (ArrayList<String>)getMatches(prefix);
		if (list.isEmpty()) {
			System.out.println("no matches");
		}
		else {
		Iterator <String>it = list.iterator();
		while (it.hasNext()) {
			String match = (String) it.next();
			System.out.println("match = " + match);
		}
		}
	}
	
	public static List<String> getMatches(String matchTo) {
		List<String> matches = new ArrayList<String>();
//		for (int i=0; i< dict.length; i++) {
//			if (((String)dict[i]).startsWith(matchTo)) {
//				matches.add(dict[i]);
//			}
//		}
		for (String  item : dict) {
			if (item.startsWith(matchTo)) {
				matches.add(item);
			}
		}
		return matches;
	}

}
