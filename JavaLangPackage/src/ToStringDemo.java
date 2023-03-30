class StringTest {
	int id;
	String name;

	public StringTest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String			toString() {
		return id + "    " + name;
	}
}

public class ToStringDemo {

	public static void main(String[] args) {

		StringTest stringTest1 = new StringTest(101, "Santosh");
		StringTest stringTest2 = new StringTest(105, "Malkar");
		System.out.println(stringTest1);
		System.out.println(stringTest2);
	}

}
