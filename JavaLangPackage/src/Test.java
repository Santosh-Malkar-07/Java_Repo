class A {

	static A a = null;

	static int count = 0;

	private A() {

	}

	public static A getA() {

		if (count <= 3) {
			a = new A();
			count++;
		}
		return a;

	}
}

public class Test {

	public static void main(String[] args) {
		System.out.println(A.getA().hashCode());
		System.out.println(A.getA().hashCode());// 1671711
		System.out.println(A.getA().hashCode());// 1671711
		System.out.println(A.getA().hashCode());
		System.out.println(A.getA().hashCode());
		System.out.println(A.getA().hashCode());// 1671711
		System.out.println(A.getA().hashCode());// 1671711
		System.out.println(A.getA().hashCode());
	}

}
