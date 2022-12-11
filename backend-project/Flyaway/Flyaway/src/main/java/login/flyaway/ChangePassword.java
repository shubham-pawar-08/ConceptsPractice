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
 * Servlet implementation class ChangePassword
 */
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		String npwd = request.getParameter("npwd");
		String message = "Changed Successfully";
		LoginDao dao = new LoginDao();
try {
		if(pwd.equals(pwd)) {
			
			dao.change(npwd, uname);
			out.println("Password Changed successfully");

//			HttpSession session = request.getSession();
//			session.setAttribute("username", uname);
//			response.sendRedirect("loginsuccess.jsp");
		}
		else {
			out.println("Please check the credentials entered");
			out.println("<a href = index.jsp input type=button > Back </a>");
		}
	}catch(Exception e) {
		
	}


}}
