package com.multithreading;

public class SystemGroupAllThreadName {

	public static void main(String[] args) {

		ThreadGroup systemThreadGroup = Thread.currentThread().getThreadGroup().getParent();
		Thread[] threads = new Thread[systemThreadGroup.activeCount()];
		systemThreadGroup.enumerate(threads);

		for (Thread thread : threads) {
			System.out.println(thread.getName() + "     " + thread.isDaemon());
		}
	}

}
