import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push("A");
		stack.push("B");
		stack.push("C");

		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack.peek());
		System.out.println(stack.search("C"));
	//	System.out.println(stack.search("C"));
	}

}
