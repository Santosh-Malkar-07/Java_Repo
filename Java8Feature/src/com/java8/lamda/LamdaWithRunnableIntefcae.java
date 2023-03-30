package com.java8.lamda;

//class Myrunnable implements Runnable {
//
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Run");
//		}
//	}
//
//}

public class LamdaWithRunnableIntefcae {

	public static void main(String[] args) {

//		Runnable runnable = new Myrunnable();
//		Thread thread = new Thread(runnable);
//		thread.start();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Main");
//		}

		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Run");
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main");
		}
	}

}
