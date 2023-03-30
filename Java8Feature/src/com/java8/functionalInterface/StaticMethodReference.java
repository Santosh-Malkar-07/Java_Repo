package com.java8.functionalInterface;

interface TestStatic {
	public void staticTest();
}

class MethodReferenceTest {

	public static void m1() {
		System.out.println("M1 Method");
	}
}

public class StaticMethodReference {

	public static void main(String[] args) {

		TestStatic testStatic = MethodReferenceTest::m1;

		testStatic.staticTest();

	}

}
