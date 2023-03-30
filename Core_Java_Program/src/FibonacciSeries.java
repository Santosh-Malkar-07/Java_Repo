class FibonacciSeri {

	// 0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
	public void getFibonacciSeries(int fabNum) {

		int firstNum = -1;
		int secondNum = 1;
		int sum = 0;
		for (int i = 0; i < fabNum; i++) {
			sum = firstNum + secondNum;
			System.out.println(sum);
			firstNum = secondNum;
			secondNum = sum;
		}
	}

	public void getFibonacciSeriesRecursion(int fabNum, Integer firstNum, Integer secondNum, Integer sum) {

		if (fabNum > 0) {
			sum = firstNum + secondNum;
			System.out.println(sum);
			firstNum = secondNum;
			secondNum = sum;
			getFibonacciSeriesRecursion(fabNum - 1, firstNum, secondNum, sum);
		}

	}
}

public class FibonacciSeries {

	public static void main(String[] args) {

		int fabNum = 10;
		Integer firstNum = -1;
		Integer secondNum = 1;
		Integer sum = 0;

		FibonacciSeri fibonacciSeri = new FibonacciSeri();
//		fibonacciSeri.getFibonacciSeries(fabNum);
		fibonacciSeri.getFibonacciSeriesRecursion(fabNum, firstNum, secondNum, sum);
	}

}
