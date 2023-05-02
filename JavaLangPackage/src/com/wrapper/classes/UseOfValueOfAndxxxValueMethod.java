package com.wrapper.classes;

/**
 * Compile java program using specified version( javac -source 1.5
 * className.java)
 * 
 * We can use valueOf() method to create wrapper object for the given primitive
 * or String this method is alternative to constructor.
 * 
 * We can use xxxValue() methods to convert wrapper object to primitive.
 * 
 * We can use parseXxx() method to convert String to corresponding primitive.
 * 
 * We can use toString() method to convert wrapper object (or) primitive to
 * String.
 * 
 */
public class UseOfValueOfAndxxxValueMethod {

	public static void main(String[] args) {

		/* Value of Methods. */
//		Integer integer = Integer.valueOf(10);
//		Double double1 = Double.valueOf(10.5);
//		Boolean boolean1 = Boolean.valueOf(true);
//		Character ch = Character.valueOf('a');
//
//		System.out.println(integer);
//		System.out.println(double1);
//		System.out.println(boolean1);// true
//		System.out.println(ch); // a
//
//		/* Second parameter is radix String. Ex 2^2*1 + 2^1*0 + 2^0*0 = 4 */
//		Integer integer2 = Integer.valueOf("100", 2);
//		System.out.println(integer2);// 4

		/* xxxValue Methods. */
		Integer integer3 = new Integer(10);
		int resultInt = integer3.intValue();
		float result = integer3.floatValue();
		System.out.println(integer3.byteValue());
		System.out.println(integer3.shortValue());
		System.out.println(integer3.floatValue());

		Character character = new Character('a');
		char ch = character.charValue();
		System.out.println(ch);

		Boolean boolean1 = new Boolean(false);
		boolean resultBoolean = boolean1.booleanValue();

		/* parseXxx() Methods. */
		int res = integer3.parseInt("10");
		boolean b = Boolean.parseBoolean("ashok");
		double d = Double.parseDouble("10.5");

		/* Radix parse int method. */
		int r = integer3.parseInt("100", 2);
		System.out.println("fff " + r);

		/*
		 * Every wrapper class contains a static toString() method to convert primitive
		 * to String.
		 */
		Integer integer = integer3.valueOf(20);
		Character character2 = character.valueOf('c');
		System.out.println(character2.toString());
		System.out.println(integer.toString());
		String s = Integer.toString(10);
		String resultBooleanP = Boolean.toString(false);
		System.out.println(s);

		/*
		 * We can not apply toString method on primitive data type otherwise we will get
		 * compile time error. but we can use PLUS(+) operator to convert into string.
		 */
		char chdata = 'a';
		int data = 10;
		String resultString = 10 + "";
		// System.out.println(chdata.toString());
		// System.out.println(data.toString());

		/* We will get error in this method. */
		UseOfValueOfAndxxxValueMethod obj = new UseOfValueOfAndxxxValueMethod();
		//obj.method(10);
		
	}

	public void method(Long long1) {
		System.out.println(long1);
	}

}
