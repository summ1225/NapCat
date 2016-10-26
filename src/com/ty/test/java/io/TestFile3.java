package com.ty.test.java.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestFile3 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		File file = new File("D:" + File.separator + "DemoU.txt");
		/**
		 * ʹ��FileInputStream����ȡ�ļ�����
		 */
		
		InputStream in = new FileInputStream(file);
		byte data[] = new byte[1024];
		while (in.read(data) != -1) {
			System.out.println(new String(data, "UTF-8"));// �������Ҫ����ת�룬��Ȼ��Ĭ�ϵ�GBK�����������������
		}
		in.close();
		
		
		
		/*
		 * �����JDK1.8 ����Ĵ������벻���� ���⣬�����FileReader ���޷�����������⣬
		 *
		 
		FileReader rd = new FileReader(file);
		char data[] = new char[1024];
		int len = 0;
		while ( (len = rd.read(data)) != -1 ){
			System.out.println(new String(new String(data,0,len).getBytes(),"UTF-8"));
		}
		*/

	}

}
