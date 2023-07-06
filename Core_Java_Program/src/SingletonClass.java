
/*Singleton class Demo*/
//class Test {
//	private static Test t = null;
//
//	private Test() {
//
//	}
//
//	public static Test getTest() {
//		if (t == null) {
//			return t = new Test();
//		}
//		return t;
//	}
//}

/*Doubleton class Demo*/
class TestTest {
	private static Test t1 = null;
	private static Test t2 = null;
	static int count = 0;

	private TestTest() {

	}

	public static Test getTest() throws Exception {
		if (t1 == null) {
			return t1 = new Test();
		} else if (t2 == null) {
			return t2 = new Test();
		} else {
			return t1;
		}

	}

//	public static Test getTest() throws Exception {
//		if (count <= 5) {
//			return t1 = new Test();
//		} 
//		return t1;
//	}
}

public class SingletonClass {

	public static void main(String[] args) throws Exception {

		System.out.println(TestTest.getTest().hashCode());
		System.out.println(TestTest.getTest().hashCode());
		System.out.println(TestTest.getTest().hashCode());
		System.out.println(TestTest.getTest().hashCode());
	}

}
