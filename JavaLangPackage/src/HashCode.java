class Student {
	public int rollno;

	public int hashCode() {
		return rollno;
	}
}

public class HashCode {

	public static void main(String[] args) {

		Student student = new Student();
		student.rollno = 100;
		System.out.println(student.hashCode());
	}

}
