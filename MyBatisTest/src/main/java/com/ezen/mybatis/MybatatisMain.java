package com.ezen.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatatisMain {

	public static void main(String[] args) {
		String resource = "com/ezen/mybatis/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session = sqlSessionFactory.openSession();

			BoardMethod mapper = session.getMapper(BoardMethod.class);
			//getMapper을 통해 인터페이스 구현 BoardMethod는 인터페이스 구현불가
			BoardVO vo = mapper.selectOne(1);
			System.out.println(vo.toString());
//			mapper.deleteBoard(10);
//			BoardVO vo3 = new BoardVO();
//			vo3.setId(9);
//			vo3.setName("손흥민");
//			vo3.setPhone("010-1111-2222");
//			vo3.setAddress("영국");
//			mapper.insertBoard(vo3);
			vo.setId(4);
			vo.setName("박도균");
			vo.setPhone("010-3333-4444");
			vo.setAddress("busan");
			mapper.updateBoard(vo);
			session.commit();
			
			System.out.println("-----------------------------------");
			List<BoardVO> list = mapper.selectAllMember();
			for(BoardVO vo2 : list)
				System.out.println(vo2.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}