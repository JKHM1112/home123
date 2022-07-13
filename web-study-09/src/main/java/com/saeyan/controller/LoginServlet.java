package com.saeyan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saeyan.dao.MemberDAO;
import com.saeyan.dto.MemberVO;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/login.jsp";
		
		HttpSession session = request.getSession();
		if (session.getAttribute("loginUser") != null) {// 이미 로그인 된 사용자이면
			url = "main.jsp"; // 메인 페이지로 이동한다.
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		String url = "member/login.jsp";	//회원 인증이 실패 하면 login.jsp 페이지를 url 변수에 저장한다.
		String userid = request.getParameter("userid");	//login.jsp 로그인 폼에서 입력한 회원의 아이디와 얻어 변수에 저장한다.
		String pwd = request.getParameter("pwd");	//login.jsp 로그인 폼에서 입력한 회원의 암호를 얻어 변수에 저장한다.
		MemberDAO mDao = MemberDAO.getInstance();	//입력받은 아이디와 암호를 member 테이블에 저장해 두었기 때문에 존재하는지 확인한다.
		int result = mDao.userCheck(userid,pwd);	//MemberDAO의 userCheck() 메소드에서는 아이디에 해당되는 회원이 존재하는지 조회합니다.
													//userCheck() 메소드를 호출하여 데이터베이스에 등록된 회원인지를 검사하여 결과값을 가져옵니다.
		if(result == 1) {	//결과값이 1이면 회원 인증이 성공한 것이므로 회원 정보를 가져옵니다.
			MemberVO mVo = mDao.getMember(userid);
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mVo);
			request.setAttribute("message", "회원 가입에 성공했습니다.");	//JSP페이지에 보낼 메시지를 요청 객체에 저장해 둡니다.
			url = "main.jsp";	//회원인증이 되었을 경우 회원테이블에서 회원정보를 얻어와 이를 MemverVO 객체에 저장해 둔 상태이다.
			//로그인 하면서 얻은 회원정보를 세션에 저장해둔다. 인증이 성공해야만 이동 가능한 main.jsp 페이지로 가도록 url 변수에 저장한다.
			
		}else if(result == 0) {	//userCheck 메소드의 리턴값이 0이면 
			request.setAttribute("message", "비밀번호가 맞지 않습니다.");
			
		}else if(result == -1) {	//userCheck 메소드의 리턴값이 -1이면 
			request.setAttribute("message", "존재하지 않는 회원입니다.");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}