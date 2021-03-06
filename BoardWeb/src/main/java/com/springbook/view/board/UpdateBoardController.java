package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.view.controller.old.Controller;

public class UpdateBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�� ���� ó��");

		int seq = Integer.parseInt(request.getParameter("seq")); 
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		BoardVO vo = new BoardVO();
		vo.setSeq(seq);
		vo.setTitle(title);
		vo.setContent(content);
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.updateBoard(vo);
		return "getBoardList.do";
	}

}
