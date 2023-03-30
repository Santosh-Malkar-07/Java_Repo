package com.design.pattern;

class SingletonTest {
	public static SingletonTest singletonTest = null;

	private SingletonTest() {

	}

//	public static synchronized SingletonTest getSinglton() {
//
//		if (singletonTest == null) {
//			singletonTest = new SingletonTest();
//		}
//		return singletonTest;
//	}

	public static synchronized SingletonTest getSinglton() {

		if (singletonTest == null) {
			synchronized (SingletonTest.class) {
				singletonTest = new SingletonTest();
			}
		}
		return singletonTest;
	}
}

public class SingletonClass {

	public static void main(String[] args) {

//		int singletonTest = SingletonTest.getSinglton().hashCode();
//		System.out.println(singletonTest);
//
//		int singletonTest1 = SingletonTest.getSinglton().hashCode();
//		System.out.println(singletonTest1);

		/* Break singletone class. */
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				int singletonTest3 = SingletonTest.getSinglton().hashCode();
				System.out.println(singletonTest3);

			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				int singletonTest4 = SingletonTest.getSinglton().hashCode();
				System.out.println(singletonTest4);

			}
		});

		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				int singletonTest3 = SingletonTest.getSinglton().hashCode();
				System.out.println(singletonTest3);

			}
		});

		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				int singletonTest4 = SingletonTest.getSinglton().hashCode();
				System.out.println(singletonTest4);

			}
		});
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}
