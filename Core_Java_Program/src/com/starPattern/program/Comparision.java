package com.starPattern.program;

//Byte Always
//Short -128 To 127
//Integer -128 To 127 
//Long -128 To 127 
//Character 0 To 127
//Boolean Always
public class Comparision {

	public static void main(String[] args) {

		Integer a = 127;
		Integer b = 127;

		if (a == b) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
	}

}
// O/P  = Fail