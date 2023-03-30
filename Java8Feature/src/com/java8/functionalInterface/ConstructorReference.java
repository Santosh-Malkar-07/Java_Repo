package com.java8.functionalInterface;

interface ConstructorInterf {
	public void constRef(String name);
}

class constructorRefTest {
	constructorRefTest(String name) {
		System.out.println("welcome : " + name);
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		ConstructorInterf constructorInterf = constructorRefTest::new;
		constructorInterf.constRef("Santosh");

	}

}
