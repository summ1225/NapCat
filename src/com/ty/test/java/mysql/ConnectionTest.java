/**
 * 这是用JDBC去链接数据库的例子
 * add by Json.X
 * 
 */

package com.ty.test.java.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// 1.加载驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		// 2. 设置数据库地址
		String DbUrl = "jdbc:mysql://127.0.0.1:3306/world";
		// 3.链接数据库
		Connection conn = DriverManager.getConnection(DbUrl, "root",
				"iamxjp123P");
		// 4.产生一个普通的执行语句
		Statement stmt = conn.createStatement();// Statement 只是适用于没有参数的查询，
												// 有参数的一般用PrepareStatement,
												// 调用存储过程的方法用prepareCall产生一个CallableStatement对象
		// 5. 执行一条查询语句
		ResultSet rs = stmt.executeQuery("select * from city");

		while (rs.next()) {

			System.out.println("name :" + rs.getString("name")
					+ ", countrycode:" + rs.getString("countrycode")
					+ ", district: " + rs.getString("district"));

		}

		rs.close();
		stmt.close();
		conn.close();

	}

}
