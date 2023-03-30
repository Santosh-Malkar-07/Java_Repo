class Swaping {

	public void swapNum(int num1, int num2) {

		int temp = num2;
		num2 = num1;
		num1 = temp;
		System.out.println("First Num : " + num1);
		System.out.println("Second Num : " + num2);
	}

	public void swapNumWithoutThirdVariable(int num1, int num2) {

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("First Num : " + num1);
		System.out.println("Second Num : " + num2);
	}
}

public class SwapTwoNum {

	public static void main(String[] args) {
		Swaping swaping = new Swaping();
//		swaping.swapNum(10, 20);
		swaping.swapNumWithoutThirdVariable(10, 20);
	}

}
