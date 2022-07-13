package unit04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Example")
public class Example extends HttpServlet {
	private static final long serialVersionUID = 1L;
//											요구							응답
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
//						요구.	사용자가 입력한 데이터를 읽어오자
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		int num1 =Integer.parseInt(request.getParameter("n1"));
		int num2 =Integer.parseInt(request.getParameter("n2"));
//							응답.출력하자
		PrintWriter out = response.getWriter();
		out.println("name = " + name);
		out.println("<br>");
		out.println("id = " + id);
		out.println("<br>");
		out.println(num1 + "+" +num2 + " = " + (num1+num2));
		out.println("<br>");
		out.println(num1 + "-" + num2 + " = " + (num1-num2));
		out.println("<br>");
		out.println(num1 + "*" + num2 + " = " + (num1*num2));
		out.println("<br>");
		out.println(num1 + "/" + num2 + " = " + (num1/num2));
		out.println("<br>");
	}

}
