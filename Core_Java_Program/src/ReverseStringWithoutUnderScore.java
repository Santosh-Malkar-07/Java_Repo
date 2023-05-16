
public class ReverseStringWithoutUnderScore {

	public static void main(String[] args) {
		String s = "santo_mal_12";

		String[] str = s.split("");
		String result = "";
		String[] position = new String[s.length()];

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("_")) {
				position[i] = str[i];
			}
		}

		String modifyString = s.replaceAll("_", "");
		for (int i = modifyString.length() - 1; i >= 0; i--) {
			result = result + modifyString.charAt(i);
		}

		for (int i = 0; i < position.length; i++) {

			if (position[i] != null && position[i].equals("_")) {
				result = result.substring(0, i) + position[i] + result.substring(i , result.length());
			}
		}

		System.out.println(result);

	}

}
