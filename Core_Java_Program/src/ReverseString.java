class ReverseStr {

	public void reverseString(String str) {

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}

	public void reverseStringUsingCharArr(String str) {

		char[] charArr = str.toCharArray();
		String reverse = "";
		for (int i = charArr.length - 1; i >= 0; i--) {
			reverse = reverse + charArr[i];
		}
		System.out.println(reverse);
	}

	public void reverseStringUsingSimpleLoop(String str) {

		String reverse = "";
		for (int i = 0; i < str.length(); i++) {

			reverse = str.charAt(i) + reverse;
		}
		System.out.println(reverse);
	}
}

public class ReverseString {

	public static void main(String[] args) {

		ReverseStr reverseStr = new ReverseStr();
//		reverseStr.reverseString("Hello");
//		reverseStr.reverseStringUsingCharArr("Hello");
		reverseStr.reverseStringUsingSimpleLoop("Hello");
	}

}
