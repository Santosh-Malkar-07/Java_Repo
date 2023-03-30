class Sorting {

	public void sortElement(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.print(i + "   ");
		}
	}

	public void sortStringArr(String[] strArr) {

		for (int i = 0; i < strArr.length; i++) {

			for (int j = i + 1; j < strArr.length; j++) {
				int result = strArr[i].compareTo(strArr[j]);

				if (result > 0) {
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}

			}
		}

		for (String i : strArr) {
			System.out.print(i + "   ");
		}
	}

}

public class SortElement {

	public static void main(String[] args) {

		int[] arr = { 10, 2, 8, -12, 7, 5, 2, 9, 1, 0 };
		Sorting sorting = new Sorting();
//		sorting.sortElement(arr);

		String[] strArr = { "Priya", "Rani", "Nitu", "Jitu", "Sonu", "Santu", "Altab" };
		sorting.sortStringArr(strArr);
	}

}
