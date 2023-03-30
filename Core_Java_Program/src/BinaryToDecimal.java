
public class BinaryToDecimal {

	public double binaryToDecimal(int x) {

		double result = 0;
		int i = 0;

		while (x != 0) {
			result = result + x % 10 * Math.pow(2, i);
			i++;
			x = x / 10;
		}

		return result;
	}

	public static void main(String[] args) {
		BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
		double finalResult = binaryToDecimal.binaryToDecimal(101);

		System.out.println(finalResult);
	}

}
