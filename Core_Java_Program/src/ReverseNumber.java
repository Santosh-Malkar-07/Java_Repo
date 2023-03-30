
public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1234;
		int x = 0;
		int result = 0;
		while (num != 0) {
			x = num % 10;
			result = result * 10 + x;
			num = num / 10;
		}
		System.out.println(result);
	}

}
