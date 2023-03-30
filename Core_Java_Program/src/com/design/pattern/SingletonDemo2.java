package com.design.pattern;

enum SingletonEnum {

	INSTANCE;

	/* For Testing purpose. */
	int i;

	public void show() {
		System.out.println(i);
	}
}

public class SingletonDemo2 {

	public static void main(String[] args) {

		SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
		singletonEnum1.i = 5;
		singletonEnum1.show();
		

		SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
		singletonEnum2.i = 6;
		
		
		singletonEnum1.show();
	}

}
