package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Success extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<h2> Successfully Register<h2>");
//		out.println("<h2> Welcome to Register servlet");
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String cond = req.getParameter("condition");
		out.println("<h2> Name:" +name + "<h2>");
		out.println("<h2> Password:" +password + "<h2>");
		out.println("<h2> email:" +email + "<h2>");
		out.println("<h2> Gender:" +gender + "<h2>");
		out.println("<h2> Course:" +course + "<h2>");
		out.println("<h2> Cond:" +cond + "<h2>");

		out.println("<td> <a href= index.html > Back </a> </td>");
//		RequestDispatcher rd1 = req.getRequestDispatcher("RegisterServelt");
//		rd1.forward(req, resp);
		
		
	}


}
