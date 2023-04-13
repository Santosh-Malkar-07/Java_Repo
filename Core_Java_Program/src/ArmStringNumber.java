

public class ArmStringNumber {

	public static void main(String[] args) {

		int num = 153;
		int orginalNum = num;
		int sum = 0;
		int lastDigit = 0;
		while (num > 0) {

			lastDigit = num % 10;
			sum = sum + lastDigit * lastDigit * lastDigit;
			num = num / 10;
		}

		if (sum == orginalNum) {
			System.out.println("Arm strong Number : " + orginalNum);
		} else {
			System.out.println("Not Arm strong  : "+orginalNum);
		}

	}

}
