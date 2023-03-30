package com.overloading.overriding;

class A {

	public void m1(Integer a) {
		System.out.println("Parent");
	}

	public void m1(Double d) {
		System.out.println("Child");
	}

}

public class OverloadingDemo {

	public static void main(String[] args) {

		A a = new A();
		a.m1(10);

		System.out.println();

	}

}
