class Student1 {

	/* Default Implemetation. */
//	public boolean equals(Object object) {
//		return (this == object);
//	}

	String name;
	int rollno;

	public Student1(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public boolean equals(Object object) {

		try {
			String name1 = this.name;
			int rollno1 = this.rollno;

			Student1 s2 = (Student1) object;
			String name2 = s2.name;
			int rollno2 = s2.rollno;

			if (name1.equals(name2) && rollno1 == rollno2) {
				return true;
			} else {
				return false;
			}

		} catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
	}
}

public class EqualsMethods {

	public static void main(String[] args) {
		Student1 s1 = new Student1("vijayabhaskar", 101);
		Student1 s2 = new Student1("bhaskar", 102);
		Student1 s3 = new Student1("vijayabhaskar", 101);
		Student1 s4 = s1;

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("vijayabhaskar"));
		System.out.println(s1.equals("null"));

	}

}
