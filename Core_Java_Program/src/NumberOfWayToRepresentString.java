
import java.util.*;

class NumberOfWayToRepresentString {

	public static void repeteStrin(String s, String result) {

		if (s.length() == 0) {
			System.out.print(result + "   ");
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String firstPart = s.substring(0, i);
			String secondPart = s.substring(i + 1);
			String combinString = firstPart + secondPart;
			repeteStrin(combinString, result + ch);
		}
	}

	public static void main(String args[]) {
		String s = "ABCD";
		String result = "";
		repeteStrin(s, result);
	}
}
