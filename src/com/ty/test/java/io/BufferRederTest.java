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
		 *  System.out.println("���������ݣ�");
			String inr = rd.readLine();
		 */
		boolean flag  = true;
		while (flag){
			System.out.println("���������䣺");
			String readLine = rd.readLine();
			if(readLine.matches("\\d{1,3}")){
				System.out.println("�����ǣ�" + Integer.parseInt(readLine));
				flag = false;
			}else{
				System.out.println("����������� Ӧ�����������");
			}
			
		}
		
		

	}

}
