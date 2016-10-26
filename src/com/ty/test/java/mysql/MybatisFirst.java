package com.ty.test.java.mysql;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import test.domain.city;

public class MybatisFirst {

	@Test
	public void findcityByid() throws IOException {

		SqlSession ss = null;
		// ��ȡһ��SqlSession
		try {
			// ��ȡResource
			InputStream in = Resources.getResourceAsStream("NapCatConfig.xml");
			// ����һ��SqlSessionFactory ��
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
			ss = ssf.openSession();
			//ȡ��һ����¼
			//city ct = ss.selectOne("selectByPrimaryKey", 1);
			//ȡ��������¼
			/*
			 * List<city> lst = ss.selectList("selectListByPrimaryKey2");
			Iterator it = lst.listIterator();
			while (it.hasNext()){
				Object obj = it.next();
				System.out.println(obj);
			}
			 */
			//����һ����¼
			city ct = new city();
		    ct.setCountryCode("IDN");
		    ct.setDistrict("west java");
		    ct.setId(40000);
		    ct.setName("xiejp3");
		    ss.insert("deleteByPrimaryKey", ct);
		    ss.commit();
		    
			//�޸�һ����¼
		    
			//ɾ��һ����¼
			
			
			
			
		} catch (Exception e) {
			System.out.println("�����Ⱑ��");
		} finally {
			ss.close();
		}
	}

}
