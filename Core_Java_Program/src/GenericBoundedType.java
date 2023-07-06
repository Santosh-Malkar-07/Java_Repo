import java.util.ArrayList;

/**
 * 
 * @param <T> = Here as the type parameter we can pass any type and there are no
 *            restrictions hence it is UNBOUNDED type.
 */
class Test5<T> {
}

/**
 * 
 * @param BOUNDED =
 * @param types   = We can bound the type parameter for a particular range by
 *                using extends keyword such types are called bounded types,
 * 
 * @param =       we can't define bounded types by using implements and super
 *                keyword
 */
class Test<T extends Number> {
	{
	}
}

/*
 * As the type parameter we can pass any type which extends Number class and
 * implements Runnable interface.
 */
class Test1<T extends Number & Runnable & Comparable> {
}

/*
 * We can't extend more than one class at a time.
 */
//class Test2<T extends Number & String> {
//	// Compile time error.
//}

/**
 * Generic methods and wild-card character (?)
 * 
 */
class Test3 {
	public void methodOne(ArrayList<?> l) {
		/*
		 * We can use this method for ArrayList of any type but within the method we
		 * can't add anything to the List except null.
		 * 
		 * This method is useful whenever we are performing only read operation.
		 * 
		 * methodOne(ArrayList<? Extends x> l)
		 */
	}

}

public class GenericBoundedType {

	public static void main(String[] args) {

//		TestTest<Integer> test = new TestTest<Integer>();
//		TestTest<Double> test1 = new TestTest<Double>();
		// Test<String> test2 = new Test<String>(); CE.
	}

}
