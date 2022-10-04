package com.smhrd.database;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//mybatis 설정파일(mybatis-config.xml) 내용을 읽어서 db커넥션 후 반환
//SqlsessionFactorybuilder : config 파일 바탕으로 SessionFactory 생성
//SqlsessionFactory : Session 생성
//Sqlsession : sql 실행, 트랜잭션 관리
public class SqlsessionManager {
	public static SqlSessionFactory sqlSession;
	static {
		String resource = "com/smhrd/database/mybatis-config.xml";
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSession = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//생성된 factory 반환
	public static SqlSessionFactory getSqlSession() {
		return sqlSession;
	}
}
