package com.ty.test.java.io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class TestFile2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// 1. ��������ļ���·��
	  File file = new File("E:" + File.separator + "demo" + File.separator + "demo.txt");
	  if (!file.getParentFile().exists()) {
		  file.getParentFile().mkdirs();
	  }
	  //2. Ӧ��ʹ��OutputStream��������������ʵ��������ʱĿ¼���ڣ��ļ�������
	    FileOutputStream fileOutputStream = new FileOutputStream(file, true);
	    
	    String str = "�ú�ѧϰ�� ��������\r\n";
	    byte data[] = str.getBytes();
	    
	    fileOutputStream.write(data);
	    fileOutputStream.close();
	  

	}

}
