import java.util.Arrays;

public class FindOccuranceOfElementUsingSort {

	public static void main(String[] args) {
		Integer[] arr = { 4, 4, 5, 3, 11, 4, 78, 8, 10, 5, 13, 17, 10, 18, 3, 3 , 18};

		Arrays.sort(arr);
		int count = 1;

		for (int i = 0; i < arr.length; i++) {

			if (i == arr.length - 1) {
				System.out.println(arr[i] + " Occurse " + count + " Times");
			} else if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				System.out.println(arr[i] + " Occurse " + count + " Times");
				count = 1;
			}
		}

	}

}
