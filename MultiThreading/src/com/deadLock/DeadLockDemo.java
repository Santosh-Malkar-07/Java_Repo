package com.deadLock;

class A {

	public synchronized void m1(B b) {
		System.out.println("Thread1 starts execution of m1 method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Thread1 trying to call b.m4() methods");
		b.m4();
	}

	public synchronized void m2() {

		System.out.println(" A class M2 method");
	}
}

class B {

	public synchronized void m3(A a) {
		System.out.println("Thread2 starts execution of m2 method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("Thread2 trying to call b.m2() methods");
		a.m2();
	}

	public synchronized void m4() {

		System.out.println(" B class M4 method");
	}

}

public class DeadLockDemo implements Runnable {

	A a = new A();
	B b = new B();

	DeadLockDemo() {

		Thread thread = new Thread(this);
		thread.start();
		a.m1(b);
	}

	public void run() {
		b.m3(a);
	}

	public static void main(String[] args) {
		new DeadLockDemo();
	}
}
