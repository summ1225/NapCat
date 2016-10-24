/**
 * ������JDBCȥ�������ݿ������
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
		// 1.������������
		Class.forName("com.mysql.jdbc.Driver");
		// 2. �������ݿ��ַ
		String DbUrl = "jdbc:mysql://127.0.0.1:3306/world";
		// 3.�������ݿ�
		Connection conn = DriverManager.getConnection(DbUrl, "root",
				"iamxjp123P");
		// 4.����һ����ͨ��ִ�����
		Statement stmt = conn.createStatement();// Statement ֻ��������û�в����Ĳ�ѯ��
												// �в�����һ����PrepareStatement,
												// ���ô洢���̵ķ�����prepareCall����һ��CallableStatement����
		// 5. ִ��һ����ѯ���
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
