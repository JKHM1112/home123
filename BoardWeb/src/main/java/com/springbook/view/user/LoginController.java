package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

public class LoginController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
			System.out.println("로그인처리");
			String id = request.getParameter("id");
			String passwrod = request.getParameter("password");
			
			UserVO vo = new UserVO();
			vo.setId(id);
			vo.setPassword(passwrod);
			
			UserDAO userDAO = new UserDAO();
			UserVO user = userDAO.getUser(vo);
			
			
			//3.화면네비게이션
			ModelAndView mav = new ModelAndView();
			if(user != null) {
				mav.setViewName("getBoardList");
			}else {
				mav.setViewName("login.jsp");
			}
			return mav;
	}
}
