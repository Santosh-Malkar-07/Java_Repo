class MinmumNum {

	public void getMinimum(int[] arr) {

		int firstSmallestNum = arr[0];
		int secondSmallestNum = 0;
		int thirdSmallestNum = 1;
		if (arr.length > 1) {
			secondSmallestNum = arr[1];
		}
		if (arr.length > 2) {
			thirdSmallestNum = arr[2];
		}

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == firstSmallestNum || arr[i] == secondSmallestNum || arr[i] == thirdSmallestNum) {
				continue;
			}

			if (firstSmallestNum > arr[i]) {
				if (i > 2) {
					thirdSmallestNum = secondSmallestNum;
				}
				secondSmallestNum = firstSmallestNum;
				firstSmallestNum = arr[i];
				continue;
			}

			if (secondSmallestNum > arr[i]) {
				thirdSmallestNum = secondSmallestNum;
				secondSmallestNum = arr[i];
				continue;
			}

			if (thirdSmallestNum > arr[i]) {
				thirdSmallestNum = arr[i];
			}
		}

		System.out.println("First smallest number : " + firstSmallestNum);
		System.out.println("Second smallest number : " + secondSmallestNum);
		System.out.println("Third smallest number : " + thirdSmallestNum);
	}
}

public class FindMinNumber {

	public static void main(String[] args) {

		int[] arr = { -800, 10, 7, 10, 89, 20, 45, 60, -11111, 55, 44, 20, 45, 156, -200, -9000, -9000, 455, -8500 };
		MinmumNum minmumNum = new MinmumNum();
		minmumNum.getMinimum(arr);
	}

}
