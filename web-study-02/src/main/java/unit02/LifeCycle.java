package unit02;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int initCount = 1;
	int doGetCount = 1;
	int destroyCount = 1;
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init Method()"+initCount++);//메소드가 첫 요청만 호출됨
	}

	public void destroy() {
		System.out.println("destroy Method()"+destroyCount++);//메소드는 톰캣이 종료될 때만 호출됨
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet Method()"+doGetCount++);//메소드가 요청될때마다 호출됨
	}

}
