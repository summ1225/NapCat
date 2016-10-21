package com.ty.test.java.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferRederTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		/*
		 *  System.out.println("请输入数据：");
			String inr = rd.readLine();
		 */
		boolean flag  = true;
		while (flag){
			System.out.println("请输入年龄：");
			String readLine = rd.readLine();
			if(readLine.matches("\\d{1,3}")){
				System.out.println("年龄是：" + Integer.parseInt(readLine));
				flag = false;
			}else{
				System.out.println("年龄输入错误， 应该由数字组成");
			}
			
		}
		
		

	}

}
