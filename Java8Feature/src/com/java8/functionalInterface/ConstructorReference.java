package com.java8.functionalInterface;

interface ConstructorInterf {
	public void constRef(String name);
}

class ConstructorRefTest {
	ConstructorRefTest(String name) {
		System.out.println("welcome : " + name);
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		ConstructorInterf constructorInterf = ConstructorRefTest::new;
		constructorInterf.constRef("Santosh");

	}

}
