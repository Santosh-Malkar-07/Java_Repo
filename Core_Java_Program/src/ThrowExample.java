class TestThrow {

	public static void validate(int age) {

		if (age < 18) {
			throw new ArithmeticException("You are not eligible to vote");

		} else {
			System.out.println("Welcome to vote");
		}
	}
}

public class ThrowExample {

	public static void main(String[] args) {
		TestThrow.validate(17);

	}

}
//-----------------------------------------------------------------------------------------
