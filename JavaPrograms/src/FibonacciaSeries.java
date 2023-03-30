
public class FibonacciaSeries {

	public void fibonSeries(int seriousnumberUpTo) {
		int a = -1, b = 1, c = 0;

		for (int i = 0; i <= seriousnumberUpTo; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

	public static void main(String[] args) {
		FibonacciaSeries fibonacciaSeries = new FibonacciaSeries();
		fibonacciaSeries.fibonSeries(10);
	}

}
