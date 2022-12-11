package login.flyaway;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logindao.flyaway.LoginDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
String uname = request.getParameter("uname");
String pwd = request.getParameter("pwd");
LoginDao dao = new LoginDao();

if(dao.check(uname, pwd)) {
	HttpSession session = request.getSession();
	session.setAttribute("justname", uname);
	response.sendRedirect("loginsuccess.jsp");
}

//else if(uname != uname) {
//	out.println("Please enter correct password <br>");
//	out.println("<a href = login.jsp input type=button > Back </a>");
////	response.sendRedirect("login.jsp");
//}
//else if(pwd != pwd){
//	out.println("Please enter correct username <br>");
//	out.println("<a href = login.jsp input type=button > Back </a>");
//}
else {
	out.println("Please enter correct credentials <br>");
	out.println("<a href = login.jsp input type=button > Back </a>");
}
	}

}
