package com.java.util.lockpackage;

import java.util.concurrent.locks.ReentrantLock;

class Display {
	ReentrantLock reentrantLock = new ReentrantLock();

	public void wish(String name) {
		reentrantLock.lock();

		for (int i = 0; i < 10; i++) {

			System.out.println("Good Morning");

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(name);
		}
		reentrantLock.unlock();
	}
}

class MyThread extends Thread {
	Display display;
	String name;

	public MyThread(Display display, String name) {
		super();
		this.display = display;
		this.name = name;
	}

	public void run() {
		display.wish(name);
	}
}

public class ReentrantLockDemo {

	public static void main(String[] args) {

		Display d = new Display();
		MyThread myThread = new MyThread(d, "Dhoni");
		MyThread myThread1 = new MyThread(d, "Surya");
		MyThread myThread2 = new MyThread(d, "Sehwag");
		myThread.start();
		myThread1.start();
		myThread2.start();
	}

}
