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
		// 1. 定义输出文件的路径
	  File file = new File("E:" + File.separator + "demo" + File.separator + "demo.txt");
	  if (!file.getParentFile().exists()) {
		  file.getParentFile().mkdirs();
	  }
	  //2. 应该使用OutputStream和其子类对象进行实例化，此时目录存在，文件还存在
	    FileOutputStream fileOutputStream = new FileOutputStream(file, true);
	    
	    String str = "好好学习， 天天向上\r\n";
	    byte data[] = str.getBytes();
	    
	    fileOutputStream.write(data);
	    fileOutputStream.close();
	  

	}

}
