import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class FindOccurance {

	public <E> void getOccurance(E[] arr) {

		int count = 0;
		char[] duplicateArr = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {

			count = 1;
			if (duplicateArr[i] == 'Y') {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					duplicateArr[j] = 'Y';
				}
			}

			System.out.println(arr[i] + " Occurse " + count + " Times");
		}
	}

	public void UsingSet() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(15);
		list.add(5);
		list.add(3);
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		for (Integer integer : set) {
			System.out.println(integer + "          " + Collections.frequency(list, integer));
		}
	}

}

public class FindOccuranceOfEachElements {
	public static void main(String[] args) {

		FindOccurance findOccurance = new FindOccurance();
		Integer[] arr = { 4, 4, 5, 3, 11, 4, 78, 8, 10, 5, 13, 17, 10, 18, 18, 18 };
//		String[] strArr = { "helo", "aa", "helo", "Yb", "Y", "qq", "aa", "d", "s", "cc", "s", "s", "s", "s", "s", "s" };
//		findOccurance.getOccurance(arr);
		findOccurance.UsingSet();
	}
}
