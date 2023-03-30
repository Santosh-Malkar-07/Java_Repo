package com.programs.java8;

interface Drawable {
	public int draw(int a, int b);
}

public class LamdaExpression {

	public static void main(String[] args) {

		Drawable drawable = (a, b) -> (a+b);
		System.out.println(drawable.draw(10,20));
		
		
		
		Drawable drawable2  = (a, b) ->{
			return (a+b);
		};
		System.out.println(drawable2.draw(10, 70));
	}

}
