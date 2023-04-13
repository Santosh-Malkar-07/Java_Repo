package com.multithreading;

class MyThread extends Thread {

	MyThread(ThreadGroup g, String name) {
		super(g, name);
	}

	public void run() {

		System.out.println("Child Thread");
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

public class ThreadGroupDemo {
	public static void main(String[] args) throws InterruptedException {

		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		MyThread myThread = new MyThread(pg, "Child Thread1");
		MyThread myThread1 = new MyThread(pg, "Child Thread2");

		myThread.start();
		myThread1.start();
	//	pg.list();
		
		System.out.println(pg.activeCount());
	//	System.out.println(pg.activeGroupCount());
		
		Thread.sleep(5000);
		System.out.println(pg.activeCount());
	}
}
