
public class SwipeString {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Santosh";

		String s3 = s1;
		s1 = s2;
		s2 = s3;

		System.out.println(s1 + "  With Third Variable       " + s2);
		System.out.println();

		String st1 = "Hello";
		String st2 = "Santosh";

		st1 = st1 + st2;
		st2 = st1.substring(0, st1.length() - st2.length());
		st1 = st1.replace(st2, "");
		System.out.println(st1 + "  Without Third Variable       " + st2);

		String str1 = "Hello";
		String str2 = "Santosh";
		str1 = str1 + str2;
		str2 = str1.replace(str2, "");
		str1 = str1.replace(str2, "");
		System.out.println(str1 + "    Without Third Variable1     " + str2);

	}

}
