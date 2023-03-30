class Duplicate {

	public static <E>  void removeDuplicate(E[] arr) {

		char[] duplicate = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {

			if (duplicate[i] == 'Y') {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					duplicate[j] = 'Y';
				}
			}
			System.out.println(arr[i]);
		}
	}
}

public class RemoveDuplicate {

	public static void main(String[] args) {

		Duplicate duplicate = new Duplicate();
		Integer[] arr = { 10, 2, 4, 8, 2, 8, 15, 13, 7, 10, 17 , 8};
		duplicate.removeDuplicate(arr);
	}

}
