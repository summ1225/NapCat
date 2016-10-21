package com.ty.test.java.io;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

class PrintUtil {
	private OutputStream output;

	public PrintUtil(OutputStream output) {
		this.output = output;
	}

	public void print(String x) throws IOException {

		this.output.write(x.getBytes());
		this.output.flush();

	}

	public void print(double x) throws IOException {

		this.print(String.valueOf(x));
	}

	public void print(int x) throws IOException {

		this.print(String.valueOf(x));
	}

	public void println(int x) throws IOException {
		this.println(String.valueOf(x));
	}

	public void println(String x) throws IOException {
		this.print(x.concat("\r\n"));
	}

	public void println(double x) throws IOException {

		this.println(String.valueOf(x));
	}

	public void close() throws IOException{
		this.output.close();
	}
}

public class PrintStreamTest{

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		PrintUtil printUtil = new PrintUtil(new FileOutputStream(new File("d:" + File.separator + "Untitled1.txt" )));
		try {
			printUtil.print(32);
			printUtil.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String name = "陈冠佑";
		int age = 19;
		double tizhong = 233.223;
		PrintStream printStream = new PrintStream((new FileOutputStream(new File("d:" + File.separator + "Untitled1.txt" ))));
		
		printStream.println(2345.21);
		printStream.printf("姓名：%s 年龄：%d 体重：%5.2f", new Object[]{name,Integer.valueOf(age),Double.valueOf(tizhong)});

	}

}
