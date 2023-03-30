package com.starPattern.program.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileDemo {
	public static void main(String[] args) throws Exception {

		PrintWriter printWriter = new PrintWriter(new FileWriter("D:\\Others\\File3.txt"));

		BufferedReader bufferedReaderFile1 = new BufferedReader(new FileReader("D:\\Others\\File1.txt"));
		BufferedReader bufferedReaderFile2 = new BufferedReader(new FileReader("D:\\Others\\File2.txt"));

		String file1 = bufferedReaderFile1.readLine();
		while (file1 != null) {
			printWriter.println(file1);
			file1 = bufferedReaderFile1.readLine();

		}

		String file2 = bufferedReaderFile2.readLine();
		while (file2 != null) {
			printWriter.println(file2);
			file2 = bufferedReaderFile2.readLine();
		}

		printWriter.flush();
		bufferedReaderFile1.close();
		bufferedReaderFile2.close();

	}
}
