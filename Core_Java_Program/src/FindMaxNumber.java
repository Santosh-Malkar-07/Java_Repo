class MaxNumber {
	public void getMax(int[] arr) {

		int maxNum = arr[0];
		int secondLargest = 0;
		int thirdLargestNum = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == maxNum || arr[i] == secondLargest || arr[i] == thirdLargestNum) {
				continue;
			}

			if (arr[i] > maxNum) {
				if (i > 1) {
					thirdLargestNum = secondLargest;
				}
				secondLargest = maxNum;
				maxNum = arr[i];
				continue;
			}

			if (arr[i] > secondLargest) {
				thirdLargestNum = secondLargest;
				secondLargest = arr[i];
				continue;
			}

			if (arr[i] > thirdLargestNum) {
				thirdLargestNum = arr[i];
			}
		}
		System.out.println("First Largest   " + maxNum);
		System.out.println("Second Largest   " + secondLargest);
		System.out.println("Third Largest   " + thirdLargestNum);
	}
}

public class FindMaxNumber {

	public static void main(String[] args) {
		int[] arr = { 7000, 0, 200, 11111, 120, -2000, 8, 1005, 0, 7000, 13, 7, 0, 100, -1000, -3000, 10020, 10000,
				7000, 11111, 11111 };
		MaxNumber maxNumber = new MaxNumber();
		maxNumber.getMax(arr);
	}

}
