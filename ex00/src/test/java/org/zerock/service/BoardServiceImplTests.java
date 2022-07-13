package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceImplTests {
	
	@Autowired
	private BoardService service;
	
	@Test
	public void testregister() {
		log.info("---------------------");
		BoardVO vo = new BoardVO();
		vo.setTitle("비오네");
		vo.setContent("이때 휴가 간 사람은");
		vo.setWriter("G되네");
		service.register(vo);
	}

	
}
