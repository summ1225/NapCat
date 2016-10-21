package com.ty.test.java.io;
/**
 * 
 * @author Î÷µã
 * 
 */

class JustFun {

	public int add(int x, int y) {

		return x + y;

	}

	public String concat(String a, String b) {
		return a + b;
	}
}

public class Foreach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (String string : args) {

			System.out.println(string);
			JustFun jstfun = new JustFun();
			jstfun.add(12, 12);

		}

	}

	public static void fun() {
		System.out.println("Hello, World");
	}

}
