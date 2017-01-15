package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");//사용자가 index.xml에서 사용자의 입력을 가져와서 저장한다.
		String password = request.getParameter("password");
		//사용자의 form data를 읽어오기
		
		PrintWriter out = response.getWriter();
		String htmlResponse="<html>";
		
		htmlResponse+="<h2> Your name is: " + username + "<br/>";
		htmlResponse+="Your password is: " + password + "<br/>";
		htmlResponse+="</html>";
		
		out.println(htmlResponse);
		//출력하기
	}

}
