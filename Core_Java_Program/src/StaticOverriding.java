class TestPoly {

	public static void m1(int a) {
		System.out.println("Parent");
	}

}

class ChildCalss extends TestPoly {
	public static void m1(int a) {
		System.out.println("Child");
	}

}

public class StaticOverriding {

	public static void main(String[] args) {
//		TestPoly testPoly = new TestPoly();
//		testPoly.m1(10); // parent
//
//		ChildCalss childCalss = new ChildCalss();
//		childCalss.m1(30); // child
//
		TestPoly testPoly1 = new ChildCalss();
		testPoly1.m1(40);

	}

}
