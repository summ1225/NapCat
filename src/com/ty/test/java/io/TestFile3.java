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
		 * 使用FileInputStream来读取文件内容
		 */
		
		InputStream in = new FileInputStream(file);
		byte data[] = new byte[1024];
		while (in.read(data) != -1) {
			System.out.println(new String(data, "UTF-8"));// 这里必须要进行转码，不然用默认的GBK编码来读会产生乱码
		}
		in.close();
		
		
		
		/*
		 * 如果用JDK1.8 下面的代码会编译不过， 另外，如果用FileReader 则无法解决乱码问题，
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
