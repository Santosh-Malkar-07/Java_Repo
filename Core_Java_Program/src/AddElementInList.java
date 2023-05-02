import java.util.Arrays;
import java.util.List;

public class AddElementInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 30, 20, 15);
		List<String> list2 = Arrays.asList("santosh", "malkar", "Priyanka");
		list.forEach(data -> {
			System.out.println(data);
		});
	}

}
