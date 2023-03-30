package com.java8.functionalInterface;

interface InterfData {

	public int m1(int a, int b);
}

class MethodRef {

	public int m1(int a, int b) {
		return a + b;
	}
}

//class MethodRunnable {
//	public void runData() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Child Thread");
//		}
//	}
//}

public class MethodReference {
	public static void main(String[] args) {
		MethodRef methodRef = new MethodRef();
		InterfData interfData = methodRef::m1;
		int sum = interfData.m1(10, 50);
		System.out.println(sum);

//		MethodRunnable methodRunnable = new MethodRunnable();
//		Runnable runnable = methodRunnable::runData;
//		Thread thread = new Thread(runnable);
//		thread.start();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Main Thread");
//		}
	}
}
