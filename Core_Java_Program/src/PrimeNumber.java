class PrimeNum {

	public void testGivenNumIsPrimeOrNot(int num) {

		boolean isNumDivisible = false;
		for (int i = 2; i < num - 1; i++) {

			if (num % i == 0) {
				isNumDivisible = true;
				break;
			}
		}
		if (isNumDivisible || num == 0 || num == 1) {
			System.out.println(num + "  Not Prime number");
		} else {
			System.out.println(num + "  Prime number");
		}
	}

	public void printFirst10PrimeNumber() {

		for (int i = 2; i < 20; i++) {

		}
	}
}

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNum primeNum = new PrimeNum();
//		primeNum.printFirst10PrimeNumber();
		primeNum.testGivenNumIsPrimeOrNot(1);
	}

}
