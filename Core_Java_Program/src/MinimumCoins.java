import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class MinimumCoins {

	static int lenght = 0;

	public static int minNumberOfCoins(List<Integer> denoms, int target) {
		lenght = denoms.size();
		if (target == 0) {
			return 0;
		}
		int result = Integer.MAX_VALUE;

		for (int i = 0; i < denoms.size(); i++) {
			if (denoms.get(i) <= target) {
				int subResult = minNumberOfCoins(denoms, target - denoms.get(i));

				if (subResult != Integer.MAX_VALUE && subResult + 1 < result) {
					result = subResult + 1;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {

		List<Integer> coins = Arrays.asList(1, 5, 10);
		int target = 7;
		System.out.println("Minimum coins required is " + minNumberOfCoins(coins, target));
	}
}
