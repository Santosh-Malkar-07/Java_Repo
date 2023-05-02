
public class DecimalToBinary {

	public void decimalToBinary(int x) {

		int s = 0; //1234

		int data = 0;
		int i = 1;
		while (x != 0) {
			s = x % 2;
			data = data + s * i; 
			x = x / 2;
			i = i * 10;
		}
		System.out.println(data);
	}

	public static void main(String[] args) {

		DecimalToBinary decimalToBinary = new DecimalToBinary();
		decimalToBinary.decimalToBinary(5);
	}

}
