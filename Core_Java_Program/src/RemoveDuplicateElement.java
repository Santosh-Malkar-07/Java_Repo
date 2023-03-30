class Duplcates {
	public void removeDuplicate(int[] arr) {

		int[] arr1 = new int[arr.length];
		int k = 0;
		boolean isFound = false;
		for (int i = 0; i < arr.length; i++) {
			isFound = false;
			for (int j = 0; j < k; j++) {
				if (arr[i] == arr1[j]) {
					isFound = true;
					break;
				}
			}
			if (!isFound) {
				arr1[k] = arr[i];
				k++;
				isFound = false;
				System.out.println(arr[i]);
			}
		}
	}
}

public class RemoveDuplicateElement {

	public static void main(String[] args) {

		int[] arr = { 10, 2, 10, 4, 8, 2, 8, 15, 0, 13, 7, 10, 17, 8 };
		String[] strArr = { "helo", "aa", "helo", "Yb", "Y", "qq", "aa", "d", "s", "cc", "s", "s", "s", "s", "s", "s" };
		Duplcates duplcates = new Duplcates();
		duplcates.removeDuplicate(arr);
	}

}
