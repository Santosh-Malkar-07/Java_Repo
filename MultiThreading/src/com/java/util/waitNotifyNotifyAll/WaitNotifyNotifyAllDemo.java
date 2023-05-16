package com.java.util.waitNotifyNotifyAll;

class ThreadB extends Thread {

	int total = 0;

	public void run() {
		synchronized (this) {

			System.out.println("child thread starts calcuation");
			for (int i = 0; i < 100; i++) {
				total = total + i;
			}
			System.out.println("child thread giving notification call");
			this.notify();
		}
	}
}

public class WaitNotifyNotifyAllDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadB threadB = new ThreadB();
		threadB.start();

		synchronized (threadB) {
			System.out.println("main Thread calling wait() method");
			threadB.wait();
			System.out.println("main Thread got notification call");
			System.out.println(threadB.total);
		}
	}

}
