import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Conversion {

	public void ArrayToListUsingLoop() {

		int[] arr = { 5, 10, 7, 14, 12, 8 };
		List<Integer> listData = new ArrayList<Integer>();

		for (int i : arr) {
			listData.add(i);
		}
		System.out.println(listData);
	}

	public void ArrayToListUsingASLIST() {

		/* It is work with only object type but not premitive. */
//		Integer[] arr = new Integer[] { 5, 10, 7, 14, 12, 8 };
//
//		List<Integer> list = Arrays.asList(arr);
//
//		for (Integer integer : list) {
//			System.out.println(integer);
//		}

		String[] strArr = new String[] { "Hema", "Rani", "Neha", "Riya", "Pillu" };
		List<String> listStr = Arrays.asList(strArr);
		List<String> listStr1 = Arrays.asList("Hema", "Rani", "Neha", "Riya", "Pillu" );

		for (String str : listStr) {
			System.out.println(str);
		}
	}

	public void ArrayToListUsingCollection() {
		String[] strArr = new String[] { "Hema", "Rani", "Neha", "Riya", "Pillu", "Priya" };
		ArrayList<String> arrayList = new ArrayList<String>();
		Collections.addAll(arrayList, strArr);
		arrayList.add("Hello");
		for (String str : arrayList) {
			System.out.println(str);
		}

	}

	// ArrayToList using java 8.
	public void ArrayToListUsingJava8() {
		String[] strArr = new String[] { "Hema", "Rani", "Neha", "Riya", "Pillu", "Priyanka" };
		List<String> arrayList = new ArrayList<String>();
		arrayList = Arrays.stream(strArr).collect(Collectors.toList());
		for (String str : arrayList) {
			System.out.println(str);
		}
	}

	/* Method to Convert List to Array. */
	public void ListToArrayUsingLoop() {
		List<String> names = new LinkedList<String>();
		names.add("Paul");
		names.add("Donal");
		names.add("James");
		names.add("Robert");
		names.add("Mery");

		String[] arr = new String[names.size()];

		for (int i = 0; i < names.size(); i++) {
			arr[i] = names.get(i);
		}

		for (String str : arr) {
			System.out.println(str);
		}
	}

	public void ListToArrayUsingToArray() {
		List<String> names = new LinkedList<String>();
		names.add("Paul");
		names.add("Donal");
		names.add("James");
		names.add("Robert");
		names.add("Heena");

		String[] str = new String[names.size()];
		str = names.toArray(str);
		for (String strData : str) {
			System.out.println(strData);
		}
	}

	public void ListToArrayUsingJava8() {
		List<String> names = new LinkedList<String>();
		names.add("Priyanka");
		names.add("Donal");
		names.add("James");
		names.add("Robert");
		names.add("Priya");

		String[] str = new String[names.size()];
		str = names.stream().toArray(String[]::new);
		for (String strData : str) {
			System.out.println(strData);
		}
	}
}

public class ArrayToListAndListToArray {

	public static void main(String[] args) {
		Conversion conversion = new Conversion();
		// conversion.ArrayToListASLIST();
		// conversion.ArrayToListUsingLoop();
		// conversion.ArrayToListUsingCollection();
		// conversion.ArrayToListUsingJava8();
		// conversion.ListToArrayUsingLoop();
		// conversion.ListToArrayUsingToArray();
		conversion.ListToArrayUsingJava8();

	}

}
