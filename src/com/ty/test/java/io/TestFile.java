package com.ty.test.java.io;
import java.io.File;
import java.io.IOException;


public class TestFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("e:" + File.separator+ "demo.txt");
		if (file.exists()){
			file.delete();
		}else{
			file.createNewFile();
		}
		
		
		
	  System.out.println(file.getAbsolutePath());

	}

}
