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
		// 获取一个SqlSession
		try {
			// 获取Resource
			InputStream in = Resources.getResourceAsStream("NapCatConfig.xml");
			// 生成一个SqlSessionFactory 类
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
			ss = ssf.openSession();
			//取出一条记录
			//city ct = ss.selectOne("selectByPrimaryKey", 1);
			//取出多条记录
			/*
			 * List<city> lst = ss.selectList("selectListByPrimaryKey2");
			Iterator it = lst.listIterator();
			while (it.hasNext()){
				Object obj = it.next();
				System.out.println(obj);
			}
			 */
			//新增一条记录
			city ct = new city();
		    ct.setCountryCode("IDN");
		    ct.setDistrict("west java");
		    ct.setId(40000);
		    ct.setName("xiejp3");
		    ss.insert("deleteByPrimaryKey", ct);
		    ss.commit();
		    
			//修改一条记录
		    
			//删除一条记录
			
			
			
			
		} catch (Exception e) {
			System.out.println("有问题啊。");
		} finally {
			ss.close();
		}
	}

}
