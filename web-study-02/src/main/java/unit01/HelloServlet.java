package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//									브라우저에게 text/html을 보낼게 그러니까 받아라
		response.setContentType("text/html; charset = utf-8");
//									utf-8인지 모르니 charset = utf-8 작성 아니면 한글 깨짐
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>");
		out.println("Hello Servlet 이한호님 안녕하세요");
		out.println("</h1></body></html>");

		out.close();

	}

}
