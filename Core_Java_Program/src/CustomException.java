class InvalidAgeExcepion extends Exception {

	public InvalidAgeExcepion(String age) {
		super(age);
	}
}

class TestException {

	public void validate(int age) throws InvalidAgeExcepion {
		if (age < 18) {
			throw new InvalidAgeExcepion("Age is not valid to vote");
		} else {
			System.out.println("Welcome to vote");
		}
	}
}

public class CustomException {

	public static void main(String[] args) {

		TestException testException = new TestException();
		try {
			testException.validate(10);
		} catch (InvalidAgeExcepion e) {
			System.out.println(e);
		}
	}

}
