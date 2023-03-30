package com.programs.java8;



public class MultiThreadUsingLamda {

	public static void main(String[] args) {

	
		Runnable runnable = () ->{
			System.out.println("Runn");
		};
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("main");
	}

}
