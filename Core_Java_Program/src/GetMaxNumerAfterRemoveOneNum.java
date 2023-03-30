import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GetMaxNumerAfterRemoveOneNum {

	public static void main(String[] args) {

		int num = 1765898; // 1765898 1576895 1576589
		String s = num + "";
		String[] str = s.split("");
		String input = 5 + "";
		String first = "";

		int max = 0;
		boolean isfirst = true;
		for (int i = 0; i < str.length; i++) {
			if (input.equals(str[i])) {
				first = s.substring(0, i) + s.substring(i + 1);
				int temp = Integer.parseInt(first);
				if (isfirst) {
					max = temp;
					isfirst = false;
				}
				if (max < temp) {
					max = temp;
				}
			}
		}
		System.out.println(max);

	}

}
