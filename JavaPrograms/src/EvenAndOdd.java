
public class EvenAndOdd {

	public static void main(String[] args) {

		int number = 27;

		/* Even and odd Using modiouls operator. */
		// if (number % 2 == 0) {
		// System.out.println("Even Number: " + number);
		// } else {
		// System.out.println("Odd Number: " + number);
		// }

		/* Even and odd Without Using modulus operator. */
//		if ((number / 2) * 2 == number) {
//			System.out.println("Even Number: " + number);
//		} else {
//			System.out.println("Odd Number: " + number);
//		}

		/* Even and odd Without Using modulus operator. */
		if ((number & 1) == 0) {
			System.out.println("Even Number: " + number);
		} else {
			System.out.println("Odd Number: " + number);
		}

	}

}
