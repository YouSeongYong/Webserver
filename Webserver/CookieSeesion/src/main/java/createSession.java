

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/createSession")
public class createSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//session 객체 생성
		HttpSession session=request.getSession();
		
		int[] number= {1,2,3};
		session.setAttribute("number",number);
	
		response.sendRedirect("Ex05getSession.jsp");
	}

}
