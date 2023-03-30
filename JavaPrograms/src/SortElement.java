
public class SortElement {

	public static void main(String[] args) {
		int[] sortData = { 5, 10, 6, 8, 6, 1, 7, 0 };
		int temp = 0;

		for (int i = 0; i < sortData.length-1; i++) {

			if (sortData[i] > sortData[i + 1]) {
				temp = sortData[i];
				sortData[i] = sortData[i + 1];
				sortData[i + 1] = sortData[i];
			}
		}
	}
}
