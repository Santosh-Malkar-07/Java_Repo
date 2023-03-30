package com.java8.lamda;

interface Interf {
	public void methodOne();
}

//class Test implements Interf {
//
//	public void methodOne() {
//		System.out.println("Hello");
//	}
//}

public class LamdataExpressionDemo {

	public static void main(String[] args) {
//		Test test = new Test();
//		test.methodOne();

		Interf interf = () -> {
			System.out.println("Welcome to interface");
		};
		interf.methodOne();
	}

}
