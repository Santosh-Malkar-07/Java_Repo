
class TestTryCatch {

	public void test() {
		try {

			System.out.println("Try Block");

			int result = 10 / 0;
			// System.exit(0);
			// return;
		} catch (Exception e) {

			System.out.println("Catch Block");
			// return;
		} finally {
			System.out.println("Final Block");
			return;
		}
	}
}

public class TryCatchDemo {

	public static void main(String[] args) {
		TestTryCatch catch1 = new TestTryCatch();
		catch1.test();
	}

}
