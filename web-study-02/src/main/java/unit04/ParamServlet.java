package unit04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		String id = request.getParameter("id");
		String age =request.getParameter("age");// 얘는 String을 받으니 입력을 안해도 null을 받는다.
//		int age = Integer.parseInt(request.getParameter("age")); //이놈은 값이 없으면 null값이여서 int가 못받는다.
		
		PrintWriter out = response.getWriter();
		out.println("id = " + id);
		out.println("age = " + age);
	}

}
