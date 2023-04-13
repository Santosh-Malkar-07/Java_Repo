package com.multithreading;

/*It is used to maintain the value for every thread. EX : For every Servlet request we need to maintain a seperate transition ID  */
public class ThreadLocalDemo {

	public static void main(String[] args) {

		ThreadLocal tl = new ThreadLocal<>();
		// System.out.println(tl.get());
		tl.set("Santosh");
		// System.out.println(tl.get());
		tl.remove();
		// System.out.println(tl.get());

		/* Setting Initial value to thread local variable. */

		ThreadLocal tl2 = new ThreadLocal() {
			protected Object initialValue() {
				return "abc1";
			}
		};

		System.out.println(tl2.get());

	}

}
