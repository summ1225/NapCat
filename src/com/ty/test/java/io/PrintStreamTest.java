package com.ty.test.java.io;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.PrintStream;

public class PrintStreamTest{

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		

		String name = "³Â¹ÚÓÓ";
		int age = 19;
		double tizhong = 233.223;
		PrintStream printStream = new PrintStream((new FileOutputStream(new File("d:" + File.separator + "Untitled1.txt" ))));
		
		printStream.println(2345.21);

	}

}
