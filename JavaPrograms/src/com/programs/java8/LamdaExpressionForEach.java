package com.programs.java8;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressionForEach {

	public static void main(String[] args) {
		
		List<String>  list = new ArrayList<String>();
		list.add("santosh");
		list.add("malkar");
		list.add("priyan ka");
		list.add("sagane");
		list.add("Revti");
		list.add("Sneha");
		
		
		list.forEach((data)   ->{
			System.out.println(data);
		});

	}

}
